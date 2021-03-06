package com.example.gamerbackend.JWT;

import com.example.gamerbackend.Model.Gamer;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtUtil {

    private String secret = "gamer";

    public String extractEmail(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public String generateToken(Gamer gamer) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, gamer.getEmail());
    }

    private String createToken(Map<String, Object> claims, String email) {

        return Jwts.builder().setClaims(claims).setSubject(email).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
                .signWith(SignatureAlgorithm.HS256, secret).compact();
    }

    //changed UserDetails class to AppUser in the function parameter.. undo it if anything goes wrong
    public Boolean validateToken(String token, Gamer gamer) {
        final String email = extractEmail(token);
        System.out.println("Username obtained from the JWT validate Token is " + gamer.getEmail());
        return (email.equals(gamer.getEmail()) && !isTokenExpired(token));
    }
}
