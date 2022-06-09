package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.DetailHoraireMapper;
import technifutur.be.university.models.DetailHoraire;
import technifutur.be.university.models.DetailHoraireDto;
import technifutur.be.university.models.DetailHoraireForm;
import technifutur.be.university.repositories.DetailHoraireRepository;
import java.util.List;

@Service
public class DetailHoraireService {
    private Long nextIdDetailHoraire = 1L;
    private final DetailHoraireRepository dhRepo;
    private final DetailHoraireMapper mapper;

    public DetailHoraireService(DetailHoraireRepository dhRepo, DetailHoraireMapper mapper) {
        this.dhRepo = dhRepo;
        this.mapper = mapper;
    }

    public DetailHoraireDto getAdminById(Long id){
        return dhRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, DetailHoraireDto.class));
    }

    public List<DetailHoraireDto> getAll(){
        return dhRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public DetailHoraire insert(DetailHoraireForm form){
        DetailHoraire detailhoraire = DetailHoraire.builder()
                .IdDetailHoraire(++nextIdDetailHoraire)
                .IdHoraire(form.getIdHoraire())
                .DateJour(form.getDateJour())
                .HeureDebut(form.getHeureDebut())
                .HeureFin(form.getHeureFin())
                .IdCours(form.getIdCours())
                .IdProfesseur(form.getIdProfesseur())
                .IdClasse(form.getIdClasse())
                .build();
        dhRepo.save(detailhoraire);
        return detailhoraire;
    }

    public DetailHoraire update(DetailHoraireForm form){
        DetailHoraire detailhoraire = DetailHoraire.builder()
                .IdHoraire(form.getIdHoraire())
                .DateJour(form.getDateJour())
                .HeureDebut(form.getHeureDebut())
                .HeureFin(form.getHeureFin())
                .IdCours(form.getIdCours())
                .IdProfesseur(form.getIdProfesseur())
                .IdClasse(form.getIdClasse())
                .build();
        detailhoraire = dhRepo.save(detailhoraire);
        return detailhoraire;
    }

//    public DetailHoraire delete(DetailHoraireForm form){
//        DetailHoraire detailhoraire = DetailHoraire.builder()
//                .DateOut(LocalDate.now())
//                .build();
//        detailhoraire = dhRepo.save(detailhoraire);
//        return detailhoraire;
//    }
}
