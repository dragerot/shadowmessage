package net.toregard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value="/greeting")
    public String sayHallo(Model model){

        model.addAttribute("greeting","Hallo");
        return "hallo";
    }

    @RequestMapping(value="/greeting2")
    public String sayHallo(){

        return "index";
    }
}
