package com.example.gamerbackend.JWT;

import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private RegistrationService registrationService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

    //nothing to add

        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
        }
//        else {
//            filterChain.doFilter(request, response);
//        }

        String authorizationHeader = request.getHeader("Authorization");
        System.out.println("authorization header is " + authorizationHeader);
        //the following is the "Authorization" given in POSTMAN.. "Authorization" is CASE SENSITIVE..
        //Key ki em peru istavo as it is adhe peru iyyi ikada guda paina getHeader() method lo
        //At present daniki, Authorization ane peru undi key ki.. value is the kinda unna token..
        //Patient eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJrYXVzaGlrc2FpMjM5NUBnbWFpbC5jb20iLCJleHAiOjE2NDg1MjgwNzgsImlhdCI6MTY0ODQ5MjA3OH0.MxWJqDWuEW2X4DBSI0mDU9LanqDGQhUWrHkUqL22NV4
        String token = null;
        String email = null;
        if(authorizationHeader!=null && authorizationHeader.startsWith("Bearer "))
        {
            token = authorizationHeader.substring(7);
            try {
                email = jwtUtil.extractEmail(token);

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("extracted email from the token is " + email);
        }

        if(email!=null && SecurityContextHolder.getContext().getAuthentication() == null)
        {
            Gamer gamer =  registrationService.findByEmail(email);
            UserDetails userDetails =  registrationService.loadUserByUsername(email);

            if(jwtUtil.validateToken(token, gamer))
            {
                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                            new UsernamePasswordAuthenticationToken(userDetails, null,userDetails.getAuthorities());
                usernamePasswordAuthenticationToken
                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
            else
            {
                System.out.println("token is not validated!");
            }
        }
        filterChain.doFilter(request, response);
    }
}
