package com.example.gamerbackend.Service;

import com.example.gamerbackend.Model.Comments;
import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Repo.CommentsRepo;
import com.example.gamerbackend.Repo.GamesRepo;
import com.example.gamerbackend.Request.CommentsRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CommentsService {

    private final CommentsRepo commentsRepo;
    private final GamesRepo gamesRepo;

    public String postComment(CommentsRequest commentsRequest, Gamer gamer, Long steamid)
    {
        Games game = gamesRepo.getBySteamID(steamid);

        System.out.println(game.getTitle() + "     " + game.getSteamid());

        Comments comment = new Comments();
        comment.setComment(commentsRequest.getComment());
        comment.setGamer(gamer); //setting the gamer ID of who posted the game.
        comment.setSteamid(game.getSteamid()); //setting the game Steam ID of the game that got the comment.
        comment.setLocalDateTime(LocalDateTime.now());
        comment.setUsername(gamer.getUsername());
        commentsRepo.save(comment);
        return "Comment stored!";
    }
}
