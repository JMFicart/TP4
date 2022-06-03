package technifutur.be.university.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantController {
    @GetMapping("/personne")
    public String getText(){
        return "EFGH";
    }
}
