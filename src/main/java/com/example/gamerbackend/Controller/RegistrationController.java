package com.example.gamerbackend.Controller;

import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Request.RegistrationRequest;
import com.example.gamerbackend.Service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ={"*"})
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping(path = "register")
    public Gamer register(@RequestBody RegistrationRequest request) throws Exception {


        Gamer gamer = registrationService.register(request);
        System.out.println(request.isType());

        return gamer;
    }

}
