package web.controllers;

import data.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vet")
    public String index(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vet/index";
    }
}
