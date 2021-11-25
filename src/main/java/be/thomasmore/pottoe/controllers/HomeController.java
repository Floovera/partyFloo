package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final String naam = "Floo";
    private final String[] sets = {"Tasjes","Potjes","Bordjes"};
    private final Set[] setso= {
            new Set("tasjes","Ilse"),
            new Set("bordjes","Bea")
    };

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("naam",naam);
        return "home";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping({"/collectie","/collectie/{set}"})
    public String collectie(Model model, @PathVariable(required = false) String set){
        model.addAttribute("set",set);
        return "collectie";
    }

    @GetMapping("/collectielijst")
    public String collectielijst(Model model){
        model.addAttribute("setso",setso);
        return "collectielijst";
    }

}
