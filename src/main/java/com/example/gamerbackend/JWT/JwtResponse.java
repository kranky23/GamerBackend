package com.example.gamerbackend.JWT;

import lombok.Data;

@Data
public class JwtResponse {

    String token;
    String email;
    Long id;


    String username;

    public JwtResponse() {
    }

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}