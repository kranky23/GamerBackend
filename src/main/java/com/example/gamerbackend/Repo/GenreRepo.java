package com.example.gamerbackend.Repo;

import com.example.gamerbackend.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GenreRepo extends JpaRepository<Genre,Long> {

    @Transactional
    @Query("select u from genre u where u.genre = ?1")
    List<Genre> getByGenre(String genre);
}
