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
@Table(name = "Login")
public class Login {
    @Id
    @Column(name = "Id_Login", nullable = false)
    private Long idLogin;
    @Column(name = "Identifiant", nullable = false, length = 50)
    private String identifiant;
    @Column(name = "Password", nullable = false, length = 45)
    private String password;
    @Column(name = "Id_Personne", nullable = false)
    private Long idPersonne;
    @Column(name = "Cancelled", nullable = false)
    private boolean cancelled;
}
