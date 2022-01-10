package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Creator;
import be.thomasmore.pottoe.repositories.CreationRepository;
import be.thomasmore.pottoe.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private CreatorRepository creatorRepository;

    @Autowired
    private CreationRepository creationRepository;

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

    @GetMapping({"/creatordetails", "/creatordetails/{id}"})
    public String creatorDetails(Model model,
                                  @PathVariable(required = false) Integer id) {
        if (id == null) return "creatordetails";

        Optional<Creator> optionalCreator = creatorRepository.findById(id);
        if (optionalCreator.isPresent()) {
            model.addAttribute("creator", optionalCreator.get());

            Iterable<Creation> creations = creationRepository.findByCreator(optionalCreator.get());
            model.addAttribute("creations",creations);
        }
        return "creatordetails";
    }


}
