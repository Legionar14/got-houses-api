package com.vkotarlic.got_house.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hi this is GOT REST API to get houses hit https://gotapihouse.herokuapp.com/api/houses/ and to get " +
                "characters hit https://gotapihouse.herokuapp.com/api/charactres/";
    }
}
