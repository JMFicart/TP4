package technifutur.be.university.models.detailhoraire;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class DetailHoraireForm {
    private Long IdDetailHoraire;
    @NotBlank(message="L'horaire ne peut être vide !")
    private Long IdHoraire;
    @NotBlank(message="La date du jour ne peut être vide !")
    private LocalDate DateJour;
    @NotBlank(message="L'heure de début du cours ne peut être vide !")
    private LocalTime HeureDebut;
    @NotBlank(message="L'heure de fin du cours ne peut être vide !")
    private LocalTime HeureFin;
    @NotBlank(message="Le cours ne peut être vide !")
    private Long IdCours;
    @NotBlank(message="Le professeur donnant le cours ne peut être vide !")
    private Long IdProfesseur;
    @NotBlank(message="La classe où se donne le cours ne peut être vide !")
    private Long IdClasse;
}
