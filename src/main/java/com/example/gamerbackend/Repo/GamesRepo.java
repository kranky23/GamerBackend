package com.example.gamerbackend.Repo;

import com.example.gamerbackend.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GamesRepo extends JpaRepository<Games,Long> {

    @Query("select u from games u where u.steamid = ?1")
    Games getBySteamID(Long steamid);
}
