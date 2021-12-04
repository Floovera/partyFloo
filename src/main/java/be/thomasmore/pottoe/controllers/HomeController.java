package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Set;
import be.thomasmore.pottoe.repositories.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class HomeController {

    private final String naam = "Floo";



    @GetMapping({"/", "/home"})
    public String home(Model model){
        model.addAttribute("naam",naam);
        return "home";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }



}
