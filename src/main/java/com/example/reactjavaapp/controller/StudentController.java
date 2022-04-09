package com.example.reactjavaapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {
    @CrossOrigin(origins = "*")
    @GetMapping("/student")
    public ResponseEntity<List<String>> getStringList() {
        String s1 = "s1";
        String s2 = "S2";
        return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(s1, s2));
    }
}
