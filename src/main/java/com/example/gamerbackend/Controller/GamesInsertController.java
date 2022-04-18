package com.example.gamerbackend.Controller;

import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Repo.GamesRepo;
import com.example.gamerbackend.Request.GameRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200/")
@AllArgsConstructor
public class GamesInsertController {

    private final GamesRepo gamesRepo;

    @PostMapping(value = "/insertGames")
    private void putGames(@RequestBody GameRequest gameRequest)
    {
        Games game = new Games();
        game.setSteamid(gameRequest.getSteamid());
        game.setTitle(gameRequest.getTitle());
//        System.out.println("game obtained is " + game.getTitle() + "  " + game.getSteamid());
        gamesRepo.save(game);
//        return "Game Stored!";
    }

}
