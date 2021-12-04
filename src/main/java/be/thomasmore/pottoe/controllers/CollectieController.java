package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Set;
import be.thomasmore.pottoe.repositories.SetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class CollectieController {

    private Logger logger = LoggerFactory.getLogger(CollectieController.class);

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

    @GetMapping("/collectie")
    public String collectie(Model model){
        List<Set> setr = setRepository.findAllBy();
        model.addAttribute("nrOfItems", setr.size());
        model.addAttribute("setr",setr);
        return "collectie";
    }

    @GetMapping("/collectie/filter")
    public String collectieFilter(Model model, @RequestParam(required = false) String type) {
        logger.info(String.format("collectieFilter -- type=%s", type));
        List<Set> setr = setRepository.findByType(type);

        model.addAttribute("nrOfItems", setr.size());
        model.addAttribute("setr", setr);
        model.addAttribute("showFilters", true);
        model.addAttribute("type",type);
        return "collectie";
    }

}
