package technifutur.be.university.mappers;

import org.springframework.stereotype.Service;
import technifutur.be.university.models.Horaire;
import technifutur.be.university.models.HoraireDto;

@Service
public class HoraireMapper {
    public HoraireDto entity2Dto(Horaire entity) {
        if(entity == null) {
            return null;
        }
        return HoraireDto.builder()
                .IdHoraire(entity.getIdHoraire())
                .LibelleHoraire(entity.getLibelleHoraire())
                .build();
    }
}
