package com.example.gamerbackend.Controller;

import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Model.Genre;
import com.example.gamerbackend.Repo.GenreRepo;
import com.example.gamerbackend.Service.GenreService;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;

import java.util.Arrays;
import java.util.List;

@RestController

@AllArgsConstructor
@CrossOrigin(origins ={"*"})
public class GameController {

    GenreService genreService;
    private GenreRepo genreRepo;

    private static final Logger logger = LogManager.getLogger(GameController.class);


    @GetMapping(value = "/games/genre/{genre}")
    private List<Genre> getGameDetailsByGenre(@PathVariable String genre)
    {
        List<Genre> list = genreRepo.getByGenre(genre);
        for(Genre g : list)
        {
            System.out.print("game is " + g.getTitle() + "  ");
        }
        if(list.isEmpty())
            logger.info("[" + HttpStatus.NOT_FOUND + "]");
        else
            logger.info("[" + HttpStatus.OK + "]");
        return list;
    }


    @GetMapping(value = "/games")
    private List<Object> getGames()
    {
        String url = "http://api.steampowered.com/ISteamApps/GetAppList/v0002/?format=json";
        RestTemplate restTemplate = new RestTemplate();

        Object games = restTemplate.getForObject(url,Object.class);
        if(Arrays.asList(games).size()==0)
            logger.info("[" + HttpStatus.NOT_FOUND + "]");
        else
            logger.info("[" + HttpStatus.OK + "]");
        return Arrays.asList(games);
    }

    @GetMapping(value = "/newReleaseGamesFromMyDatabase")
    private List<Genre> newReleaseGamesFromMyDatabase() throws JSONException {
        List<Genre> genres = genreRepo.getByReleaseDate();

//        for(Genre i:genres)
//        {
//            System.out.println(i.getTitle());
//        }
        if(genres.isEmpty())
            logger.info("[" + HttpStatus.NOT_FOUND + "]");
        else
            logger.info("[" + HttpStatus.OK + "]");
        return genreRepo.getByReleaseDate();


    }

    @GetMapping(value = "/newReleaseGames/{appid}")
    private Object newlyReleasedGames(@PathVariable long appid) throws JSONException {
        System.out.println("Obtained app id is " + appid);
        String url = "https://store.steampowered.com/api/appdetails?appids="+appid;
        RestTemplate restTemplate = new RestTemplate();

        Object games = (LinkedHashMap) restTemplate.getForObject(url,Object.class);
//        System.out.println(games);
//        System.out.println(((LinkedHashMap<?, ?>) games).keySet());

//        LinkedHashMap game = restTemplate.getForObject(url,LinkedHashMap.class);
//        System.out.println(game.values());
//        System.out.println(((LinkedHashMap)game.get(appid)));


//        JSONObject jsonObj = new JSONObject(games.toString());

//        System.out.println("json object is " + jsonObj +" class is " +jsonObj.getClass());

//        appClass = (Appid) games;
//        appClass = restTemplate.getForObject(url,Appid.class);

//        System.out.println(appClass.getSuccess());

//        ResponseEntity<Object> responseEntity = restTemplate.getForEntity(url, Object.class);
//        Object objects =  responseEntity.getBody();
//        System.out.println("Objects are " + objects.toString());


//        Appid response = restTemplate.getForObject(url, Appid.class);
//        System.out.println(response.getSuccess());

//        JSONPObject json = new JSONPObject(games);
        logger.info("[" + HttpStatus.OK + "]");;
        return games;
    }





}
