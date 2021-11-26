package be.thomasmore.pottoe.controllers;

import be.thomasmore.pottoe.model.Set;
import be.thomasmore.pottoe.repositories.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final String naam = "Floo";
    private final Set[] setso= {
            new Set(0,"tasjes","Ilse"),
            new Set(1,"bordjes","Bea")
    };
    @Autowired
    private SetRepository setRepository;


    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("naam",naam);
        return "home";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping({"/collectie","/collectie/{index}"})
    public String collectie(Model model, @PathVariable(required = false) Integer index){
        if(index != null && index >= 0 && index < setso.length){
            model.addAttribute("set",setso[index]);
        }
        return "collectie";
    }

    @GetMapping("/collectiebyid/{id}")
    public String collectiebyid(Model model, @PathVariable(required = false) Integer id){
        model.addAttribute("set",setRepository.findById(id).get());
        return "collectie";
    }

    @GetMapping("/collectielijst")
    public String collectielijst(Model model){
        Iterable<Set> setr = setRepository.findAll();
        model.addAttribute("setr",setr);
        return "collectielijst";
    }


}
