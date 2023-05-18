package com.springboot.assessment.Controllers;

import com.springboot.assessment.Schema.AuthRequest;
import com.springboot.assessment.Schema.Train;
import com.springboot.assessment.Schema.User;
import com.springboot.assessment.Services.TrainService;
import com.springboot.assessment.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainController {
    @Autowired
    private TrainService trainService;
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    AuthRequest authReq;
    @Autowired
    User user;
    String token = jwtUtil.generateToken(user.getUserName());
    @Autowired


    public boolean isAdmin(String token){
        Claims claims = jwtUtil.extractAllClaims(token);
        String role = (String) claims.get("role");
        if(role=="Admin") return true;
        else return false;
    }
    @PostMapping("/addTrain")
    public String addTrain(List<Train> trains){

        if(isAdmin(token)) {
            trainService.addTrain(trains);
            return "Train Added";
        }
        else
            return("Not admin");
    }

}