package com.example.gamerbackend.Controller;

import com.example.gamerbackend.JWT.JwtResponse;
import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Repo.GamesRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@AllArgsConstructor
public class AdminController {


    private final GamerRepo gamerRepo;
    private final GamesRepo gamesRepo;

    @GetMapping(path = "getGamers")
    public List<Gamer> fetchAllGamers()
    {
        Games temp = gamesRepo.getBySteamID(1L);
        if(temp==null)
            System.out.println("temp is null");
        List<Gamer> gamers = gamerRepo.getAllGamers();
        return gamers;
    }

    @DeleteMapping(path = "deleteGamer/{email}")
    public void deleteGamer(@PathVariable String email)
    {
        gamerRepo.deleteGamerByEmail(email);
//        return "Gamer deleted successfully!";
//        return new ResponseEntity<>("DELETE Response", HttpStatus.OK);
//        return ResponseEntity.ok(new JwtResponse());
    }
}
