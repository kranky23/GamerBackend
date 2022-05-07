package com.example.gamerbackend;

import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.UserNameValidator;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Request.RegistrationRequest;
import com.example.gamerbackend.Service.RegistrationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.Optional;

public class RegistrationServiceTest {

    private UserNameValidator userNameValidator;
    private GamerRepo gamerRepo;
   // private final static String USER_NOT_FOUND_MSG = "user with email %s not found";
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private JavaMailSender mailSender;

    private RegistrationService registrationService;

    @BeforeEach
    public void setup(){
        gamerRepo=Mockito.mock(GamerRepo.class);
        mailSender=Mockito.mock(JavaMailSender.class);
        bCryptPasswordEncoder=Mockito.mock(BCryptPasswordEncoder.class);
        userNameValidator=new UserNameValidator(gamerRepo);
        registrationService=new RegistrationService(userNameValidator,gamerRepo,bCryptPasswordEncoder,mailSender);
    }

    @Test
    public void testRegister() throws Exception {
        RegistrationRequest request=new RegistrationRequest("user@gmail.com","password","password",true);
        Gamer gamer=new Gamer();
        gamer.setId(123L);
        Optional<Gamer> byUserName=Optional.empty();
        Mockito.when(gamerRepo.findUserName(ArgumentMatchers.anyString())).thenReturn(byUserName);
        Mockito.when(gamerRepo.findEmail(ArgumentMatchers.anyString())).thenReturn(byUserName);
        Mockito.when(bCryptPasswordEncoder.encode(ArgumentMatchers.anyString())).thenReturn("encoded");
        Mockito.when(gamerRepo.save(ArgumentMatchers.any(Gamer.class))).thenReturn(gamer);
        //Session session=new Session()
        MimeMessage message=Mockito.mock(MimeMessage.class);
        Mockito.when(mailSender.createMimeMessage()).thenReturn(message);
        Mockito.doNothing().when(mailSender).send(ArgumentMatchers.any(MimeMessage.class));
        Gamer gamer1=registrationService.register(request);
        Assertions.assertEquals("user@gmail.com",gamer1.getUsername());

    }
}
