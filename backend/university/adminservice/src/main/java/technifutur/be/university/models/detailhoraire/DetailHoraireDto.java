package technifutur.be.university.models.detailhoraire;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class DetailHoraireDto {
    private Long IdDetailHoraire;
    private Long IdHoraire;
    private LocalDate DateJour;
    private LocalTime HeureDebut;
    private LocalTime HeureFin;
    private Long IdCours;
    private Long IdProfesseur;
    private Long IdClasse;
}
