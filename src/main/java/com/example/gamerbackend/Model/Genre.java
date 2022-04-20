package com.example.gamerbackend.Model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode

@Entity(name = "genre")
public class Genre {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // auto generated when we create a user.

    @Column
    private String title;

    @Column()
    private Long steamid;

    @Column
    private String releasedate;

    @Column
    private String genre;

    @Column
    private String startsWith;


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

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String date) {
        this.releasedate = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStartsWith() {
        return startsWith;
    }

    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }
}
