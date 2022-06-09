package technifutur.be.university.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HoraireDto {
    private Long IdHoraire;
    private String LibelleHoraire;
}
