package be.thomasmore.pottoe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final String naam = "Floo";

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
        model.addAttribute("set",(set!=null)? set : "oops kies iets uit de collectie");
        return "collectie";
    }

    @GetMapping("/collectielijst")
    public String collectielijst(){
        return "collectielijst";
    }

}
