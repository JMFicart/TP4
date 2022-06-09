package technifutur.be.university.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technifutur.be.university.models.Admin;
import technifutur.be.university.models.DemandeInscription;
import technifutur.be.university.repositories.AdminRepository;
import technifutur.be.university.repositories.DemandeInscriptionRepository;

import java.text.ParseException;
import java.time.LocalDate;

@Component
public class DatabaseFiller implements InitializingBean {
    private final AdminRepository cRepo;
    private final DemandeInscriptionRepository dRepo;

    public DatabaseFiller(AdminRepository cRepo, DemandeInscriptionRepository dRepo) {
        this.cRepo = cRepo;
        this.dRepo = dRepo;
    }

    private void setupDB() throws ParseException {
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

        DemandeInscription d = DemandeInscription.builder()
                .idDemandeInscription(1L)
                .NomDemandeur("Gémal")
                .PrenomDemandeur("Jim")
                .AdresseDemandeur("Rue du Far-West")
                .NoRueDemandeur("15")
                .LocaliteDemandeur("Flémalle")
                .CodePostalDemandeur("4000")
                .TelephoneDemandeur("048/126497")
                .EmailDemandeur("j.gemal@gmail.com")
                .DateDemande(LocalDate.now())
                .DemandeTraitee(false)
                .build();
        dRepo.save(d);
        System.out.println("Demande inscription : " + d.getNomDemandeur() + " " + d.getPrenomDemandeur());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupDB();
    }
}
