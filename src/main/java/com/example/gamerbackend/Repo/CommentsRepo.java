package com.example.gamerbackend.Repo;

import com.example.gamerbackend.Model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentsRepo extends JpaRepository<Comments,Long> {

    @Query("select c from comments c where c.steamid = ?1 order by c.id desc")
    List<Comments> getBySteamID(Long steamid);

    @Query("select c from comments c where c.username = ?1")
    List<Comments> getByGamerUsername(String username);
}
