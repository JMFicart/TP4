package technifutur.be.university.models.cours;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CoursForm {
    private Long idCours;
    @NotBlank(message="Le libellé du cours ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String LibelleCours;
    @NotBlank(message="L'indicateur de présence obligatoire ne peut être vide !")
    private Boolean PresenceObligatoire;
}
