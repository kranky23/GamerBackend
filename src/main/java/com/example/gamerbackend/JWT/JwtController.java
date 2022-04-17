package com.example.gamerbackend.JWT;


import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RegistrationService registrationService;

//    @Autowired
//    private Doctor doctor; //added component to admin model

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private GamerRepo gamerRepo;


    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception
    {
        System.out.println("Obtained request is " + jwtRequest.getEmail());
        try
        {
            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getEmail(), jwtRequest.getPassword()));

        }catch(UsernameNotFoundException e){
            e.printStackTrace();

            throw new Exception("Bad Credentials - username not found");
        }catch(BadCredentialsException e){
            e.printStackTrace();

            throw new Exception("Bad Credentials");
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        JwtResponse jwtResponse = new JwtResponse();


//        Optional<Gamer> temp = gamerRepo.findUserName(jwtRequest.getUsername());

        Optional<Gamer> gamer = gamerRepo.findEmail(jwtRequest.getEmail());

        System.out.println("Username is" + gamer.get().getUsername());
        System.out.println("Gamer  id is" + gamer.get().getId());
        System.out.println("password is" + gamer.get().getPassword());
//        System.out.println("Doc id is" + appUser.getDoc_id());


        String token = this.jwtUtil.generateToken(gamer.get());

        System.out.println("JWT token is "+token);

        jwtResponse.setToken(token);
        jwtResponse.setEmail(jwtRequest.getEmail());
        jwtResponse.setId(gamer.get().getId());

        return ResponseEntity.ok(jwtResponse);
    }
}

