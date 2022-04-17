package com.example.gamerbackend.Service;

import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.UserNameValidator;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Request.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RegistrationService implements UserDetailsService {

    private final UserNameValidator userNameValidator;
    private final GamerRepo gamerRepo;
    private final static String USER_NOT_FOUND_MSG = "user with email %s not found";
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Gamer register(RegistrationRequest request) throws Exception {

        boolean isUserNameValid = userNameValidator.isUserNamePresent(request.getUsername());
        boolean isEmailValid = userNameValidator.isEmailPresent(request.getUsername());

        System.out.println("is username valid value is " + isUserNameValid);
        if(isUserNameValid || isEmailValid)
            throw new IllegalStateException("Username already exists");

        if(!request.getPassword().equals(request.getRepassword()))
            throw new Exception("Passwords dont match! Try again");


        String encodedPassword = bCryptPasswordEncoder.encode(request.getPassword());

        Gamer gamer =  new Gamer(request.getUsername(),encodedPassword, request.getEmail(), true);//creating new gamer

        gamerRepo.save(gamer);  //saving the gamer details to our gamer repo i.e. dB

        return gamer;
    }

    public Gamer findByUserName(String username)
    {
        Optional<Gamer> byUserName = gamerRepo.findUserName(username);
        if(byUserName.isPresent())
            return byUserName.get();
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Gamer> byEmail = gamerRepo.findEmail(email);

        return byEmail
                .orElseThrow(()-> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG,email)));
    }
}
