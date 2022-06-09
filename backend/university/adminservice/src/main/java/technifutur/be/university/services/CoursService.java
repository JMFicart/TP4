package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.CoursMapper;
import technifutur.be.university.models.Cours;
import technifutur.be.university.models.CoursDto;
import technifutur.be.university.models.CoursForm;
import technifutur.be.university.repositories.CoursRepository;
import java.util.List;

@Service
public class CoursService {
    private Long nextIdCours = 2L;
    private final CoursRepository cRepo;
    private final CoursMapper mapper;

    public CoursService(CoursRepository cRepo, CoursMapper mapper) {
        this.cRepo = cRepo;
        this.mapper = mapper;
    }

    public CoursDto getAdminById(Long id){
        return cRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, CoursDto.class));
    }

    public List<CoursDto> getAll(){
        return cRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public Cours insert(CoursForm form){
        Cours cours = Cours.builder()
                .idCours(++nextIdCours)
                .LibelleCours(form.getLibelleCours())
                .PresenceObligatoire(form.getPresenceObligatoire())
                .build();
        cRepo.save(cours);
        return cours;
    }

    public Cours update(CoursForm form){
        Cours cours = Cours.builder()
                .LibelleCours(form.getLibelleCours())
                .PresenceObligatoire(form.getPresenceObligatoire())
                .build();
        cours = cRepo.save(cours);
        return cours;
    }

//    public Cours delete(CoursForm form){
//        Cours cours = Cours.builder()
//                .DateOut(LocalDate.now())
//                .build();
//        cours = cRepo.save(cours);
//        return cours;
//    }
}
