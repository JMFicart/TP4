package technifutur.be.university.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technifutur.be.university.models.Admin;
import technifutur.be.university.repositories.AdminRepository;

import java.text.ParseException;
import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean {
    private final AdminRepository cRepo;

    public DatabaseFiller(AdminRepository cRepo) {
        this.cRepo = cRepo;
    }

    private void setupAdmin() throws ParseException {
        Admin a = Admin.builder()
                .idPersonne(3L)
                .NomPersonne("Poppins")
                .PrenomPersonne("Marie")
                .AdressePersonne("Rue du balai")
                .NoRuePersonne("30")
                .LocalitePersonne("Bouge")
                .CodePostalPersonne("5005")
                .TelephonePersonne("081/691316")
                .EmailPersonne("m.poppins@gmail.com")
                .DateIn(LocalDate.now())
                .TypePersonne("A")
                .Id_Horaire(0L)
                .Id_Login(3L)
                .build();
        cRepo.save(a);
        System.out.println("Admin : " + a.getNomPersonne() + " " + a.getPrenomPersonne());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupAdmin();
    }
}
