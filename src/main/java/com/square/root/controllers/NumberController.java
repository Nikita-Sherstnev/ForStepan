package com.square.root.controllers;

import com.square.root.Chislo;
import com.square.root.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class NumberController {
    @Autowired
    private NumberService numberService;

    @GetMapping("/")
    public void get(){
        System.out.println("Get request");
    }

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Chislo addNumber(@RequestBody Chislo chislo){
        return numberService.toSquare(chislo);
    }

}
