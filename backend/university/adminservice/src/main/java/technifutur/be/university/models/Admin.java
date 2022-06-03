package technifutur.be.university.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "Personne")
public class Admin {
    @Id
    @Column(name = "Id_Personne", nullable = false)
    private Long idPersonne;
    @Column(name = "NomPersonne", nullable = false, length = 200)
    private String NomPersonne;
    @Column(name = "PrenomPersonne", nullable = false, length = 200)
    private String PrenomPersonne;
    @Column(name = "AdressePersonne", nullable = false, length = 200)
    private String AdressePersonne;
    @Column(name = "NoRuePersonne", nullable = false, length = 10)
    private String NoRuePersonne;
    @Column(name = "LocalitePersonne", nullable = false, length = 200)
    private String LocalitePersonne;
    @Column(name = "CodePostalPersonne", nullable = false, length = 10)
    private String CodePostalPersonne;
    @Column(name = "TelephonePersonne", nullable = false, length = 20)
    private String TelephonePersonne;
    @Column(name = "EmailPersonne", nullable = false, length = 200)
    private String EmailPersonne;
    @Column(name = "DateIn", nullable = false)
    private LocalDate DateIn;
    @Column(name = "DateOut", nullable = true)
    private LocalDate DateOut;
    @Column(name = "TypePersonne", nullable = false, length = 1)
    private String TypePersonne;
    @Column(name = "Id_Horaire", nullable = false)
    private Long Id_Horaire;
    @Column(name = "Id_Login", nullable = false)
    private Long Id_Login;
}
