package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Creation;
import be.thomasmore.pottoe.model.Creator;
import be.thomasmore.pottoe.repositories.CreationRepository;
import be.thomasmore.pottoe.repositories.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CreationController {

    @Autowired
    private CreationRepository creationRepository;

    @Autowired
    private CreatorRepository creatorRepository;

    @GetMapping("/creationlist")
    public String creationList(Model model) {
        Iterable<Creation> creations = creationRepository.findAll();
        model.addAttribute("creations", creations);
        return "creationlist";
    }

    @GetMapping("/creationlist/filter")
    public String creationListFilter(Model model,
                                     @RequestParam(required = false) String type) {

        List<Creation> creations = creationRepository.findByType(type);

        model.addAttribute("creations", creations);
        model.addAttribute("showFilters", true);
        model.addAttribute("type",type);

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
            editedCreation.setType(creation.getType());
            editedCreation.setExtraInfo(creation.getExtraInfo());
            editedCreation.setPrice(creation.getPrice());
            editedCreation.setCreator(creation.getCreator());
            creationRepository.save(editedCreation);
            model.addAttribute("creation",creation) ;
        }
        return "redirect:/creationdetails/" +id;
    }

    @GetMapping("/creationnew")
    public String partyNew(Model model) {
        model.addAttribute("creation", new Creation());
        model.addAttribute("creators", creatorRepository.findAll());
        return "creationnew";
    }

    @PostMapping("/creationnew")
    public String creationNewPost(Model model,
                               @ModelAttribute("creation") Creation creation) {
        Creation newCreation = creationRepository.save(creation);
        return "redirect:/creationdetails/" + newCreation.getId();
    }

}
