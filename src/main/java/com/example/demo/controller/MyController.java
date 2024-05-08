package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MyController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String test(){
        return "test working.";
    }
    @GetMapping("/get2")
    public List<Users> test1(){
        return userRepository.findAll();
    }

    @PostMapping
    public String postTest(@RequestBody String name){
        return name;
    }

    @PostMapping("/save")
    public String addUser(@RequestBody Users users){
        userRepository.save(users);
        return "added";
    }

}
