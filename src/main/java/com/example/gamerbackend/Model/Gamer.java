package com.example.gamerbackend.Model;

import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@EqualsAndHashCode

@Entity(name = "gamer")
public class Gamer implements UserDetails {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // auto generated when we create a user.

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;
    @Column
    private boolean active;

    @Column
    private boolean type; //if 1 then gamer else if 0 then admin

    public Gamer(String username, String password, String email, boolean type) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = true;
        this.type = type;
    }

    public Gamer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("User");

        return Collections.singletonList(authority);
    }


}
