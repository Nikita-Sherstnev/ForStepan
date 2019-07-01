package com.square.root.services;

import com.square.root.Chislo;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class NumberService {
    public Chislo toSquare(Chislo c){
        c.setNumber(c.getNumber()*c.getNumber());
        return c;
    }
}
