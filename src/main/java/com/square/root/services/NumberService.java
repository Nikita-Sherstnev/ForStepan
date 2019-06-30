package com.square.root.services;

import com.square.root.Chislo;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public static Chislo toSquare(Chislo c){
        c.setNumber(c.getNumber()*c.getNumber());
        return c;
    }
}
