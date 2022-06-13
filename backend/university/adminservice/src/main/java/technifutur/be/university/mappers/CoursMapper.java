package technifutur.be.university.mappers;

import org.springframework.stereotype.Service;
import technifutur.be.university.models.cours.Cours;
import technifutur.be.university.models.cours.CoursDto;

@Service
public class CoursMapper {
    public CoursDto entity2Dto(Cours entity) {
        if(entity == null) {
            return null;
        }
        return CoursDto.builder()
                .idCours(entity.getIdCours())
                .LibelleCours(entity.getLibelleCours())
                .PresenceObligatoire(entity.getPresenceObligatoire())
                .build();
    }
}
