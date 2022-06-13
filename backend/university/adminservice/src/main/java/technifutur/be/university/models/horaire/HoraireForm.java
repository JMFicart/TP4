package technifutur.be.university.models.horaire;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class HoraireForm {
    private Long IdHoraire;
    @NotBlank(message="Le nom de l'horaire ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String LibelleHoraire;
}
