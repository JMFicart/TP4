package technifutur.be.university.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "DetailHoraire")
public class DetailHoraire {
    @Id
    @Column(name = "Id_DetailHoraire", nullable = false)
    private Long IdDetailHoraire;
    @Column(name = "Id_Horaire", nullable = false)
    private Long IdHoraire;
    @Column(name = "DateJour", nullable = false)
    private LocalDate DateJour;
    @Column(name = "HeureDebut", nullable = false)
    private LocalTime HeureDebut;
    @Column(name = "HeureFin", nullable = false)
    private LocalTime HeureFin;
    @Column(name = "Id_Cours", nullable = false)
    private Long IdCours;
    @Column(name = "Id_Professeur", nullable = false)
    private Long IdProfesseur;
    @Column(name = "Id_Classe", nullable = false)
    private Long IdClasse;
}
