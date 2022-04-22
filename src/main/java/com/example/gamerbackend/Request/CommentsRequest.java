package com.example.gamerbackend.Request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@EqualsAndHashCode
@ToString
public class CommentsRequest {

    private final String comment;
    private final String title;

    public CommentsRequest(String comment, String title) {
        this.comment = comment;
        this.title = title;
    }
}
