package com.example.gamerbackend.Model;

import com.example.gamerbackend.Repo.GamerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class UserNameValidator {

    private final GamerRepo gamerRepo;

    public boolean isUserNamePresent(String username) {

        Optional<Gamer> byUserName = gamerRepo.findUserName(username);

        if(byUserName.isPresent())
            return true;

        return false;
    }

    public boolean isEmailPresent(String email)
    {
        Optional<Gamer> byEmail = gamerRepo.findEmail(email);

        if(byEmail.isPresent())
            return true;

        return false;
    }

}
