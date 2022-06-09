package technifutur.be.university.models;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "Horaire")
public class Horaire {
    @Id
    @Column(name = "Id_Horaire", nullable = false)
    private Long IdHoraire;
    @Column(name = "LibelleHoraire", nullable = false, length = 200)
    private String LibelleHoraire;
}
