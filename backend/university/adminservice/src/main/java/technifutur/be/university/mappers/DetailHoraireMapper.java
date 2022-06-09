package technifutur.be.university.mappers;

import org.springframework.stereotype.Service;
import technifutur.be.university.models.DetailHoraire;
import technifutur.be.university.models.DetailHoraireDto;

@Service
public class DetailHoraireMapper {
    public DetailHoraireDto entity2Dto(DetailHoraire entity) {
        if (entity == null) {
            return null;
        }
        return DetailHoraireDto.builder()
                .IdDetailHoraire(entity.getIdDetailHoraire())
                .IdHoraire(entity.getIdHoraire())
                .DateJour(entity.getDateJour())
                .HeureDebut(entity.getHeureDebut())
                .HeureFin(entity.getHeureFin())
                .IdCours(entity.getIdCours())
                .IdProfesseur(entity.getIdProfesseur())
                .IdClasse(entity.getIdClasse())
                .build();
    }
}
