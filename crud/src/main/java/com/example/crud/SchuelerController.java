package com.example.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class SchuelerController {
    @Autowired
    private SchuelerRepository schuelerRepository;

    @RequestMapping(value= "/schueler", method = RequestMethod.GET)
    public String schuelerIndex(Model model) {
        model.addAttribute("schueler", schuelerRepository.findAll());
        return "schueler/index";
    }

    @RequestMapping(value ="/schueler/new", method = RequestMethod.GET)
    public String schuelerNew(){
        return "schueler/new";
    }

    @RequestMapping(value = "/schueler", method = RequestMethod.POST)
    public String schuelerCreate(Schueler schueler) {
    schueler = schuelerRepository.save(schueler);
    return "redirect:/schueler/" + schueler.getId();
    }
    @RequestMapping(value ="/schueler/{schuelerId}", method = RequestMethod.GET)
    public String schuelerShow(@PathVariable("schuelerId") Integer schuelerId, Model model){
        Schueler schueler = schuelerRepository.findById(schuelerId).get();
        model.addAttribute("schueler",  schueler);

        return "schueler/show";
    }


}

