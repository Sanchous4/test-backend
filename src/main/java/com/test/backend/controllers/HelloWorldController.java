package com.test.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HelloWorld {

    @RequestMapping(value = "/", method = GET)
    public @ResponseBody String getHelloWorld() {
        return "Hello, World";
    }
}
