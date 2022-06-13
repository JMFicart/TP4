package technifutur.be.university.models.cours;

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
@Table(name = "Cours")
public class Cours {
    @Id
    @Column(name = "Id_Cours", nullable = false)
    private Long idCours;
    @Column(name = "LibelleCours", nullable = false, length = 200)
    private String LibelleCours;
    @Column(name = "PresenceObligatoire", nullable = false)
    private Boolean PresenceObligatoire;
}
