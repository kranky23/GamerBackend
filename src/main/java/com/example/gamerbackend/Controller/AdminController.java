package com.example.gamerbackend.Controller;

import com.example.gamerbackend.JWT.JwtResponse;
import com.example.gamerbackend.Model.Gamer;
import com.example.gamerbackend.Repo.GamerRepo;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@AllArgsConstructor
public class AdminController {


    private final GamerRepo gamerRepo;

    @GetMapping(path = "getGamers")
    public List<Gamer> fetchAllGamers()
    {
        List<Gamer> gamers = gamerRepo.getAllGamers();
        return gamers;
    }

    @PostMapping(path = "deleteGamer/{email}")
    public ResponseEntity<?> deleteGamer(@PathVariable String email)
    {
        gamerRepo.deleteGamerByEmail(email);
//        return "Gamer deleted successfully!";
        return ResponseEntity.ok(new JwtResponse());
    }
}
