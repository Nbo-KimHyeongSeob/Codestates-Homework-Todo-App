package com.codestates.homeworktodoapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class Controller {

    @GetMapping
    public String request(){
        return "To-do Application !";
    }

    // Squash Merge Test 1
}
