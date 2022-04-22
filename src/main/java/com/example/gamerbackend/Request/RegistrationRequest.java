package com.example.gamerbackend.Request;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String email;
    private final String username;
    private final String password;
    private final String repassword;
    private final boolean type;

    public RegistrationRequest(String email, String password, String repassword, boolean type) {
        this.username = email;
        this.password = password;
        this.repassword = repassword;
        this.email = email;
        this.type = true;
    }

}
