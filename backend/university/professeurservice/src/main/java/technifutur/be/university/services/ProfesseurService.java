package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.ProfesseurMapper;
import technifutur.be.university.models.Professeur;
import technifutur.be.university.models.ProfesseurDto;
import technifutur.be.university.models.ProfesseurForm;
import technifutur.be.university.repositories.ProfesseurRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProfesseurService {
    private Long nextIdProfesseur = 3L;
    private final ProfesseurRepository cRepo;
    private final ProfesseurMapper mapper;

    public ProfesseurService(ProfesseurRepository cRepo, ProfesseurMapper mapper) {
        this.cRepo = cRepo;
        this.mapper = mapper;
    }

    public ProfesseurDto getProfesseurById(Long id){
        return cRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, ProfesseurDto.class));
    }

//    public EtudiantDto getEtudiantByIdentifiant(String identifiant){
//        return this.cRepo.findByIdentifiant(identifiant)
//                .map(mapper::entity2Dto)
//                .orElseThrow(() -> new ElementNotFoundException(identifiant, EtudiantDto.class));
//    }

    public List<ProfesseurDto> getAll(){
        return cRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public Professeur insert(ProfesseurForm form){
        Professeur professeur = Professeur.builder()
                .idPersonne(++nextIdProfesseur)
                .NomPersonne(form.getNomPersonne())
                .PrenomPersonne(form.getPrenomPersonne())
                .AdressePersonne(form.getAdressePersonne())
                .NoRuePersonne(form.getNoRuePersonne())
                .LocalitePersonne(form.getLocalitePersonne())
                .CodePostalPersonne(form.getCodePostalPersonne())
                .TelephonePersonne(form.getTelephonePersonne())
                .EmailPersonne(form.getEmailPersonne())
                .DateIn(form.getDateIn())
                .TypePersonne("P")
                .Id_Horaire(form.getId_Horaire())
                .Id_Login(form.getId_Login())
                .build();
        cRepo.save(professeur);
        return professeur;
    }

    public Professeur update(ProfesseurForm form){
        Professeur professeur = Professeur.builder()
                .NomPersonne(form.getNomPersonne())
                .PrenomPersonne(form.getPrenomPersonne())
                .AdressePersonne(form.getAdressePersonne())
                .NoRuePersonne(form.getNoRuePersonne())
                .LocalitePersonne(form.getLocalitePersonne())
                .CodePostalPersonne(form.getCodePostalPersonne())
                .TelephonePersonne(form.getTelephonePersonne())
                .EmailPersonne(form.getEmailPersonne())
                .DateIn(form.getDateIn())
                .TypePersonne("P")
                .Id_Horaire(form.getId_Horaire())
                .Id_Login(form.getId_Login())
                .build();
        professeur = cRepo.save(professeur);
        return professeur;
    }

    public Professeur delete(ProfesseurForm form){
        Professeur professeur = Professeur.builder()
                .DateOut(LocalDate.now())
                .build();
        professeur = cRepo.save(professeur);
        return professeur;
    }
}
