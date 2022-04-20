package com.example.gamerbackend.Request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class GameDetailsRequest {

    private final Long steamid;
    private final String title;
    private final String genre;
    private final String releasedate;
    private final String startsWith;


    public GameDetailsRequest(Long steamid, String title, String genre, String date, String startsWith) {
        this.steamid = steamid;
        this.title = title;
        this.genre = genre;
        this.releasedate = date;
        this.startsWith = startsWith;
    }
}
