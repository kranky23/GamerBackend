package com.example.gamerbackend.Service;

import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.UserNameValidator;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Request.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RegistrationService implements UserDetailsService {

    private final UserNameValidator userNameValidator;
    private final GamerRepo gamerRepo;
    private final static String USER_NOT_FOUND_MSG = "user with email %s not found";
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final JavaMailSender mailSender;

    public Gamer register(RegistrationRequest request) throws Exception {

        boolean isUserNameValid = userNameValidator.isUserNamePresent(request.getUsername());
        boolean isEmailValid = userNameValidator.isEmailPresent(request.getUsername());

        System.out.println("is username valid value is " + isUserNameValid);
        if(isUserNameValid || isEmailValid)
            throw new IllegalStateException("Username already exists");

        if(!request.getPassword().equals(request.getRepassword()))
            throw new Exception("Passwords dont match! Try again");


        String encodedPassword = bCryptPasswordEncoder.encode(request.getPassword());
        //if type == true then gamer
        //else type == false then admin
        Gamer gamer =  new Gamer(request.getUsername(),encodedPassword, request.getEmail(), request.isType());//creating new gamer

        gamerRepo.save(gamer);  //saving the gamer details to our gamer repo i.e. dB
//        sendOTPEmail(gamer); // send email on successful registration
        return gamer;
    }

    private void sendOTPEmail(Gamer gamer) throws UnsupportedEncodingException, MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom("gamer@support.com", "Gamer Automated Response");
        helper.setTo(gamer.getEmail());

        String subject = "Registration Successful on GamerHub!";

        String content = "<p>Hello " + gamer.getUsername() + "</p>"
                + "<p>Welcome to GamerHub! "
                + "<p><b>" + "</b></p>"
                + "<br>"
                + "<p>Keep exploring games and do not forget to review your favourite games.</p>";

        helper.setSubject(subject);

        helper.setText(content, true);

        mailSender.send(message);
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
