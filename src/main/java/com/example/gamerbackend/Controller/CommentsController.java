package com.example.gamerbackend.Controller;

import com.example.gamerbackend.JWT.JwtResponse;
import com.example.gamerbackend.Model.Comments;
import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Repo.CommentsRepo;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Repo.GamesRepo;
import com.example.gamerbackend.Request.CommentsRequest;
import com.example.gamerbackend.Service.CommentsService;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@AllArgsConstructor
@CrossOrigin(origins ={"*"})
public class CommentsController {

    private CommentsService commentsService;
    private GamesRepo gamesRepo;
    private GamerRepo gamerRepo;
    private CommentsRepo commentsRepo;


    private static final Logger logger = LogManager.getLogger(CommentsController.class);

    @PostMapping(value = "/postcomment/{email}/{steamid}")
    private ResponseEntity<?> postComment(@RequestBody CommentsRequest commentsRequest,
                                          @PathVariable String email, @PathVariable Long steamid)
    {
        Gamer gamer = gamerRepo.getByEmail(email);
        Games temp = gamesRepo.getBySteamID(steamid);
        System.out.println("steam id is " + steamid);
        System.out.println("comment is "+ commentsRequest.getComment());
//        System.out.println("Game name is " +  temp.getTitle());
        //if the game is not in my dB, then I am instantly adding it to my dB and then adding the comments to that game
        if(temp==null)
        {
            logger.info("[" + HttpStatus.NOT_FOUND + "]");
            System.out.println(" i am null ");
            Games game = new Games();
            game.setTitle(commentsRequest.getTitle());
            game.setSteamid(steamid);
            gamesRepo.save(game);
            logger.info("[" + HttpStatus.OK + "]");
        }

        logger.info("[" + HttpStatus.OK + "]");

        commentsService.postComment(commentsRequest,gamer,steamid);
        return ResponseEntity.ok(new JwtResponse());
    }

    @GetMapping(value = "/getComments/{steamid}")
    private List<Comments> getCommentsByGame(@PathVariable Long steamid)
    {
        List<Comments> comments = commentsRepo.getBySteamID(steamid);
        if(comments.size()==0)
            logger.info("[" + HttpStatus.NOT_FOUND + "]");
        else
            logger.info("[" + HttpStatus.OK + "]");
        for(Comments c : comments)
        {
            System.out.println("Comments are " + c);
        }


        return comments;
    }

    @GetMapping(value = "/getCommentsOfGamer/{username}")
    private List<Comments> getCommentsByGamer(@PathVariable String username)
    {
        List<Comments> comments = commentsRepo.getByGamerUsername(username);
        if(comments.size()==0)
            logger.info("[" + HttpStatus.NOT_FOUND + "]");
        else
            logger.info("[" + HttpStatus.OK + "]");

//        for(Comments c : comments)
//        {
//            System.out.println("Comments are " + c);
//        }

        return comments;
    }


}
