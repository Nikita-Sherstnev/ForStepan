package com.square.root.services;

import com.square.root.Chislo;
import com.square.root.ChisloRepository;
import org.springframework.stereotype.Service;

@Service
public class NumberService {
    private ChisloRepository chisloRepository;

    public NumberService(ChisloRepository chisloRepository){
        this.chisloRepository = chisloRepository;
    }

    public Chislo toSquare(Chislo c){
        c.setRes(c.getParam()*c.getParam());
        chisloRepository.save(c);
        return c;
    }
}
