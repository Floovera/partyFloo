package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Set;
import be.thomasmore.pottoe.repositories.CreationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class CreationController {

    @Autowired
    private CreationRepository creationRepository;

    @GetMapping("/creationlist")
    public String partyList(Model model) {
        Iterable<Creation> creations = creationRepository.findAll();
        model.addAttribute("creations", creations);
        return "creationlist";
    }

    @GetMapping({"/creationdetails", "/creationdetails/{id}"})
    public String partyDetails(Model model,
                               @PathVariable(required = false) Integer id) {
        if (id == null) return "creationdetails";

        Optional<Creation> optionalCreation = creationRepository.findById(id);
        if (optionalCreation.isPresent()) {
            long nrOfCreations = creationRepository.count();
            model.addAttribute("creation", optionalCreation.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfCreations);
            model.addAttribute("nextId", id < nrOfCreations ? id + 1 : 1);
        }
        return "creationdetails";
    }

}
