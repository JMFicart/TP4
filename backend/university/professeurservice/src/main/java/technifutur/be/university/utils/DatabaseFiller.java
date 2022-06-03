package technifutur.be.university.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technifutur.be.university.models.Professeur;
import technifutur.be.university.repositories.ProfesseurRepository;

import java.text.ParseException;
import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean {
    private final ProfesseurRepository cRepo;

    public DatabaseFiller(ProfesseurRepository cRepo) {
        this.cRepo = cRepo;
    }

    private void setupProfesseur() throws ParseException {
        Professeur p = Professeur.builder()
                .idPersonne(2L)
                .NomPersonne("Klump")
                .PrenomPersonne("Sherman")
                .AdressePersonne("Rue de la bonne bouffe")
                .NoRuePersonne("25")
                .LocalitePersonne("Champion")
                .CodePostalPersonne("5002")
                .TelephonePersonne("081/9862363")
                .EmailPersonne("s.klump@gmail.com")
                .DateIn(LocalDate.now())
                .TypePersonne("P")
                .Id_Horaire(0L)
                .Id_Login(2L)
                .build();
        cRepo.save(p);
        System.out.println("Professeur : " + p.getNomPersonne() + " " + p.getPrenomPersonne());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupProfesseur();
    }
}
