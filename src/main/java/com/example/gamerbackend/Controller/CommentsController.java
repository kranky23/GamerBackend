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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@AllArgsConstructor
@CrossOrigin(origins ={"*"})
public class CommentsController {

    private CommentsService commentsService;
    private GamesRepo gamesRepo;
    private GamerRepo gamerRepo;
    private CommentsRepo commentsRepo;

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
            System.out.println(" i am null ");
            Games game = new Games();
            game.setTitle(commentsRequest.getTitle());
            game.setSteamid(steamid);
            gamesRepo.save(game);
        }

        commentsService.postComment(commentsRequest,gamer,steamid);
        return ResponseEntity.ok(new JwtResponse());
    }

    @GetMapping(value = "/getComments/{steamid}")
    private List<Comments> getCommentsByGame(@PathVariable Long steamid)
    {
        List<Comments> comments = commentsRepo.getBySteamID(steamid);

        for(Comments c : comments)
        {
            System.out.println("Comments are " + c);
        }
        return comments;
    }
}
