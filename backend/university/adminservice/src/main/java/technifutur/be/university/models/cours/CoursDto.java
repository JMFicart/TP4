package technifutur.be.university.models.cours;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoursDto {
    private Long idCours;
    private String LibelleCours;
    private Boolean PresenceObligatoire;
}
