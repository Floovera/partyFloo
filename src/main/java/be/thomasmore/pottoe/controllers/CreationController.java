package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Creator;
import be.thomasmore.pottoe.model.Set;
import be.thomasmore.pottoe.repositories.CreationRepository;
import be.thomasmore.pottoe.repositories.CreatorRepository;
import be.thomasmore.pottoe.repositories.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CreationController {

    @Autowired
    private CreationRepository creationRepository;

    @Autowired
    private SetRepository setRepository;

    @Autowired
    private CreatorRepository creatorRepository;

    @GetMapping("/creationlist")
    public String partyList(Model model) {
        Iterable<Creation> creations = creationRepository.findAll();
        model.addAttribute("creations", creations);
        return "creationlist";
    }

    @GetMapping({"/creationdetails", "/creationdetails/{id}"})
    public String creationDetails(Model model,
                               @PathVariable(required = false) Integer id) {
        if (id == null) return "creationdetails";

        Optional<Creation> optionalCreation = creationRepository.findById(id);
        if (optionalCreation.isPresent()) {
            model.addAttribute("creation", optionalCreation.get());
        }
        return "creationdetails";
    }

    @GetMapping({"/creationedit", "/creationedit/{id}"})
    public String creationEdit(Model model,
                               @PathVariable(required = false) Integer id) {
        if (id == null) return "creationedit";

        Optional<Creation> optionalCreation = creationRepository.findById(id);
        if (optionalCreation.isPresent()) {
            model.addAttribute("creation", optionalCreation.get());
            model.addAttribute("sets", setRepository.findAll());
            model.addAttribute("creators", creatorRepository.findAll());

        }
        return "creationedit";
    }

    @PostMapping("/creationedit/{id}")
    public String partyEditPost(Model model,
                                @PathVariable int id,
                                @ModelAttribute("creation") Creation creation) {

        Optional<Creation> optionalCreation = creationRepository.findById(id);
        if (optionalCreation.isPresent()) {
            Creation editedCreation = optionalCreation.get();
            editedCreation.setName(creation.getName());
            creationRepository.save(editedCreation);
            model.addAttribute("creation",creation) ;
        }
        return "redirect:/creationdetails/" +id;
    }

    @GetMapping("/creationnew")
    public String partyNew(Model model) {
        model.addAttribute("creation", new Creation());
        model.addAttribute("sets", setRepository.findAll());
        model.addAttribute("creators", creatorRepository.findAll());
        return "creationnew";
    }

    @PostMapping("/creationnew")
    public String creationNewPost(Model model,
                               @ModelAttribute("creation") Creation creation,
                               @RequestParam int setId, @RequestParam int creatorId) {

        creation.setSet(new Set(setId));
        creation.setCreator(new Creator(creatorId));
        Creation newCreation = creationRepository.save(creation);
        return "redirect:/creationdetails/" + newCreation.getId();
    }

}
