package com.example.gamerbackend.Repo;

import com.example.gamerbackend.Model.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface GamerRepo extends JpaRepository<Gamer,Long> {

    @Transactional
    @Query("select u from gamer u where u.username = ?1")
    Optional<Gamer> findUserName(String username);

//    Transactional
    @Query("select u from gamer u where u.email = ?1")
    Optional<Gamer> findEmail(String email);
}
