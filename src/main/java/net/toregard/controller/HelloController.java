package net.toregard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value="/greeting",method= RequestMethod.GET)
    public String sayHallo(Model model){

        model.addAttribute("greeting","Hallo");
        return "hallo4";
    }

    @RequestMapping(value="/greeting2", method=RequestMethod.GET)
    public String sayHallo2(){

        return "index";
    }
}
