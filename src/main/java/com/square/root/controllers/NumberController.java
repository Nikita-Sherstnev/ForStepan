package com.square.root.controllers;

import com.square.root.Chislo;
import com.square.root.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.socket.sockjs.client.SockJsClient;

@Controller
public class NumberController {
    @Autowired
    private NumberService numberService;
    volatile private SockJsClient sockJsClient;

    @GetMapping("/")
    public ModelAndView get() {
        ModelAndView mav = new ModelAndView("index.html");

        System.out.println("Get request");
        return mav;
    }

    @GetMapping("/stop")
    public void stopMessageBroker(){
        System.out.println("stop");
        if (this.sockJsClient.isRunning())
            this.sockJsClient.stop();
    }

    @MessageMapping("/connect")
    @SendTo("/topic/connect")
    public Chislo addNumber(@RequestBody @Payload Chislo chislo) {
        return numberService.toSquare(chislo);
    }
}
