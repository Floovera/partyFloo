package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Creator;
import be.thomasmore.pottoe.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private CreatorRepository creatorRepository;

    @GetMapping({"/", "/home"})
    public String home(Model model){
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        Iterable<Creator> creators = creatorRepository.findAll();
        model.addAttribute("creators", creators);
        return "about";
    }



}
