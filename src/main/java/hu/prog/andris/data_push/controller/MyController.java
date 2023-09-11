package hu.prog.andris.data_push.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/reg")
    public String getRegPage(){
        return "reg";
    }

    @GetMapping("/show")
    public String getShowPage(){
        return "show";
    }
}
