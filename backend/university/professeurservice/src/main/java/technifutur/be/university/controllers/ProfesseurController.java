package technifutur.be.university.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfesseurController {
    @GetMapping("/personne")
    public String getText(){
        return "EFGH";
    }
}
