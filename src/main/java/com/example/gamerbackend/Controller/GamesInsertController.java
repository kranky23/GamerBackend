package com.example.gamerbackend.Controller;

import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Model.Genre;
import com.example.gamerbackend.Repo.GamesRepo;
import com.example.gamerbackend.Repo.GenreRepo;
import com.example.gamerbackend.Request.GameDetailsRequest;
import com.example.gamerbackend.Request.GameRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:4200/")
@AllArgsConstructor
public class GamesInsertController {

    private final GamesRepo gamesRepo;
    private final GenreRepo genreRepo;

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


    @PostMapping(value = "/insertGameDetails")
    private void insertGameDetails(@RequestBody GameDetailsRequest gameDetailsRequest)
    {
        System.out.println(gameDetailsRequest.getReleasedate());
        System.out.println(gameDetailsRequest.getTitle());


        Genre genre = new Genre();
        genre.setGenre(gameDetailsRequest.getGenre());
        genre.setReleasedate(gameDetailsRequest.getReleasedate());
        genre.setStartsWith(gameDetailsRequest.getStartsWith());
        genre.setSteamid(gameDetailsRequest.getSteamid());
        genre.setTitle(gameDetailsRequest.getTitle());
//        System.out.println("game obtained is " + game.getTitle() + "  " + game.getSteamid());
        genreRepo.save(genre);

//        return "Game Stored!";
    }

}
