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
public class CollectieController {

    @Autowired
    private SetRepository setRepository;

    @GetMapping("/setbyid")
    public String set(Model model){
        return "set";
    }

    @GetMapping("/setbyid/{id}")
    public String setbyid(Model model, @PathVariable(required = false) Integer id){

        Optional<Set> optionalSet = setRepository.findById(id);
        if (optionalSet.isPresent()) {
            long nrOfSets = setRepository.count();
            model.addAttribute("set", optionalSet.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfSets);
            model.addAttribute("nextId", id < nrOfSets ? id + 1 : 1);
        }
        return "set";
    }

    @GetMapping("/collectielijst")
    public String collectielijst(Model model){
        Iterable<Set> setr = setRepository.findAll();
        long nrOfItems = setRepository.count();
        model.addAttribute("nrOfItems", nrOfItems);
        model.addAttribute("setr",setr);
        return "collectielijst";
    }

    @GetMapping("/collectielijst/filter")
    public String venueListFilter(Model model) {
        Iterable<Set> setr = setRepository.findAll();
        long nrOfItems = setRepository.count();
        model.addAttribute("nrOfItems", nrOfItems);
        model.addAttribute("setr", setr);
        model.addAttribute("showFilters", true);
        return "collectielijst";
    }

}
