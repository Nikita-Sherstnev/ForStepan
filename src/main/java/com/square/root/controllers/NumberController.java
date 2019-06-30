package com.square.root.controllers;

import com.square.root.Chislo;
import com.square.root.services.NumberService;
import org.springframework.web.bind.annotation.*;

@RestController
public class NumberController {

    @GetMapping("/")
    public void print(){
        System.out.println("OLOLLOL");
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Chislo addNumber(@RequestBody Chislo chislo){
        chislo = NumberService.toSquare(chislo);
        return chislo;
    }

}
