package hu.yellowroad.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.printf("Hello!!!");
        return "nothing to return";
    }
}
