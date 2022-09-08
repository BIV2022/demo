package com.example.demo.controllers;

import com.example.demo.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Random;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    CurrencyService currencyService;
    @GetMapping
    public String getMainPage(CurrencyService currencyService) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        currencyService.number = String.valueOf((new Random().nextInt(101)));
        int temp = Integer.valueOf(currencyService.number);
        if (temp < 21) {
            currencyService.img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPJxrS9U6bw21nSHvPi5A_Hw5yeg4TrR2Er531qQv4KA&s";
            currencyService.name = "Nissan 350Z";
        }
        else if (temp > 20 && temp < 41) {
            currencyService.img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8kXJcJPwgavUST-ledHdlDe30yp0wcmzpJQ&usqp=CAU";
            currencyService.name = "Mazda RX-7";
        }
        else if (temp > 40 && temp < 61) {
            currencyService.img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmpAkzXAlCvIcjd-uffX9it8NsrJcY9vQjPw&usqp=CAU";
            currencyService.name = "Subaru Impreza";
        }
        else if (temp > 60 && temp < 81) {
            currencyService.img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwA6vI4NbqgIBZ-6ctY0IpfKwiZchAOKi8GA&usqp=CAU";
            currencyService.name = "Acura RSX";
        }
        else {
            currencyService.img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCUCz3tPmbaI_5ZUyR13ea0B9e518VIrWDPA&usqp=CAU";
            currencyService.name = "Volkswagen Golf GTI";
        }
        return "index.html"; }
}
