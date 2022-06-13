package technifutur.be.university.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import technifutur.be.university.models.admin.Admin;
import technifutur.be.university.models.inscriptions.DemandeInscription;
import technifutur.be.university.models.detailhoraire.DetailHoraire;
import technifutur.be.university.models.horaire.Horaire;
import technifutur.be.university.repositories.AdminRepository;
import technifutur.be.university.repositories.DemandeInscriptionRepository;
import technifutur.be.university.repositories.DetailHoraireRepository;
import technifutur.be.university.repositories.HoraireRepository;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class DatabaseFiller implements InitializingBean {
    private final AdminRepository cRepo;
    private final DemandeInscriptionRepository dRepo;
    private final HoraireRepository hRepo;
    private final DetailHoraireRepository dhRepo;

    public DatabaseFiller(AdminRepository cRepo, DemandeInscriptionRepository dRepo, HoraireRepository hRepo, DetailHoraireRepository dhRepo) {
        this.cRepo = cRepo;
        this.dRepo = dRepo;
        this.hRepo = hRepo;
        this.dhRepo = dhRepo;
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

        Horaire h = Horaire.builder()
                .IdHoraire(1L)
                .LibelleHoraire("Horaire des 1ères années")
                .build();
        hRepo.save(h);
        System.out.println("Horaire : " + h.getIdHoraire() + " " + h.getLibelleHoraire());

        DetailHoraire dh = DetailHoraire.builder()
                .IdDetailHoraire(1L)
                .IdHoraire(1L)
                .DateJour(LocalDate.of(2022,9,6))
                .HeureDebut(LocalTime.of(8,30))
                .HeureFin(LocalTime.of(9, 30))
                .IdCours(1L)
                .IdProfesseur(1L)
                .IdClasse(1L)
                .build();
        hRepo.save(h);
        System.out.println("Détail horaire : " + dh.getIdHoraire() + " " + dh.getDateJour() + " " + dh.getHeureDebut() + " " + dh.getHeureFin());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        setupDB();
    }
}
