package com.example.henvcrud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/first")
public class FirstLogicController {

    @GetMapping("/get-first")
    public String getFirstStringWithCRUD(){
        return "henv";
    }
  
}
