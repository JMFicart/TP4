package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.EtudiantMapper;
import technifutur.be.university.models.Etudiant;
import technifutur.be.university.models.EtudiantDto;
import technifutur.be.university.models.EtudiantForm;
import technifutur.be.university.repositories.EtudiantRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class EtudiantService {
    private Long nextIdEtudiant = 3L;
    private final EtudiantRepository cRepo;
    private final EtudiantMapper mapper;

    public EtudiantService(EtudiantRepository cRepo, EtudiantMapper mapper) {
        this.cRepo = cRepo;
        this.mapper = mapper;
    }

    public EtudiantDto getEtudiantById(Long id){
        return cRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, EtudiantDto.class));
    }

//    public EtudiantDto getEtudiantByIdentifiant(String identifiant){
//        return this.cRepo.findByIdentifiant(identifiant)
//                .map(mapper::entity2Dto)
//                .orElseThrow(() -> new ElementNotFoundException(identifiant, EtudiantDto.class));
//    }

    public List<EtudiantDto> getAll(){
        return cRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public Etudiant insert(EtudiantForm form){
        Etudiant etudiant = Etudiant.builder()
                .idPersonne(++nextIdEtudiant)
                .NomPersonne(form.getNomPersonne())
                .PrenomPersonne(form.getPrenomPersonne())
                .AdressePersonne(form.getAdressePersonne())
                .NoRuePersonne(form.getNoRuePersonne())
                .LocalitePersonne(form.getLocalitePersonne())
                .CodePostalPersonne(form.getCodePostalPersonne())
                .TelephonePersonne(form.getTelephonePersonne())
                .EmailPersonne(form.getEmailPersonne())
                .DateIn(form.getDateIn())
                .TypePersonne("E")
                .Id_Horaire(form.getId_Horaire())
                .Id_Login(form.getId_Login())
                .build();
        cRepo.save(etudiant);
        return etudiant;
    }

    public Etudiant update(EtudiantForm form){
        Etudiant etudiant = Etudiant.builder()
                .NomPersonne(form.getNomPersonne())
                .PrenomPersonne(form.getPrenomPersonne())
                .AdressePersonne(form.getAdressePersonne())
                .NoRuePersonne(form.getNoRuePersonne())
                .LocalitePersonne(form.getLocalitePersonne())
                .CodePostalPersonne(form.getCodePostalPersonne())
                .TelephonePersonne(form.getTelephonePersonne())
                .EmailPersonne(form.getEmailPersonne())
                .DateIn(form.getDateIn())
                .TypePersonne("E")
                .Id_Horaire(form.getId_Horaire())
                .Id_Login(form.getId_Login())
                .build();
        etudiant = cRepo.save(etudiant);
        return etudiant;
    }

    public Etudiant delete(EtudiantForm form){
        Etudiant etudiant = Etudiant.builder()
                .DateOut(LocalDate.now())
                .build();
        etudiant = cRepo.save(etudiant);
        return etudiant;
    }
}
