package com.deepak1.welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"","/","/home"})
      public String displayHomePage(){

        return "login.html";
    }
}
