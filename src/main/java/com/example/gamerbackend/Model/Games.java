package com.example.gamerbackend.Model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode

@Entity(name = "games")
public class Games {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // auto generated when we create a user.

    @Column
    private String title;

    @Column
    private Long steamid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getSteamid() {
        return steamid;
    }

    public void setSteamid(Long steamid) {
        this.steamid = steamid;
    }
}
