package com.example.gamerbackend.Repo;

import com.example.gamerbackend.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepo extends JpaRepository<Games,Long> {
}
