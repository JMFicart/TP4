package technifutur.be.university.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technifutur.be.university.models.Etudiant;
import technifutur.be.university.repositories.EtudiantRepository;

import java.text.ParseException;
import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean {
    private final EtudiantRepository cRepo;

    public DatabaseFiller(EtudiantRepository cRepo) {
        this.cRepo = cRepo;
    }

    private void setupEtudiant() throws ParseException {
        Etudiant e = Etudiant.builder()
                .idPersonne(1L)
                .NomPersonne("Dupont")
                .PrenomPersonne("Jules")
                .AdressePersonne("Rue de la montagne Sainte Barbe")
                .NoRuePersonne("10")
                .LocalitePersonne("Jambes")
                .CodePostalPersonne("5100")
                .TelephonePersonne("081/643625")
                .EmailPersonne("j.dupont@gmail.com")
                .DateIn(LocalDate.now())
                .TypePersonne("E")
                .Id_Horaire(0L)
                .Id_Login(1L)
                .build();
        cRepo.save(e);
        System.out.println("Etudiant : " + e.getNomPersonne() + " " + e.getPrenomPersonne());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupEtudiant();
    }
}
