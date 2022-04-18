package com.example.gamerbackend.Request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class GameRequest {

    private final Long steamid;
    private final String title;

    public GameRequest(Long steamid, String title) {
        this.steamid = steamid;
        this.title = title;
    }
}
