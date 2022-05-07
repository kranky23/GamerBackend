package com.example.gamerbackend;

import com.example.gamerbackend.Model.Comments;
import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Model.Games;
import com.example.gamerbackend.Repo.CommentsRepo;
import com.example.gamerbackend.Repo.GamerRepo;
import com.example.gamerbackend.Repo.GamesRepo;
import com.example.gamerbackend.Repo.GenreRepo;
import com.example.gamerbackend.Request.CommentsRequest;
import com.example.gamerbackend.Service.CommentsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;

public class GamerBackendTests {

    private GamerRepo gamerRepo;

    private GamesRepo gamesRepo;

    private GenreRepo genreRepo;

    private CommentsRepo commentsRepo;

    private CommentsService commmentsService=null;

    @BeforeEach
    public void setup(){
        gamesRepo=Mockito.mock(GamesRepo.class);
        commentsRepo=Mockito.mock(CommentsRepo.class);
        commmentsService=new CommentsService(commentsRepo,gamesRepo);
    }

    @Test
    public void testPostComment(){
        CommentsRequest commentsRequest=new CommentsRequest("Sibin","Sibin");
        Gamer gamer=new Gamer();
        Games game=new Games();
        game.setSteamid(123L);

        Comments comments=new Comments();
        Mockito.when(gamesRepo.getBySteamID(ArgumentMatchers.anyLong())).thenReturn(game);
        Mockito.when(commentsRepo.save(ArgumentMatchers.any(Comments.class))).thenReturn(comments);
        String res=commmentsService.postComment(commentsRequest,gamer,123L);
        Assertions.assertEquals("Comment stored!",res);
    }
}
