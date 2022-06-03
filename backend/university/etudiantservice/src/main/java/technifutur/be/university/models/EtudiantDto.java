package technifutur.be.university.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EtudiantDto {
    private Long idPersonne;
    private String NomPersonne;
    private String PrenomPersonne;
    private String AdressePersonne;
    private String NoRuePersonne;
    private String LocalitePersonne;
    private String CodePostalPersonne;
    private String TelephonePersonne;
    private String EmailPersonne;
    private LocalDate DateIn;
    private LocalDate DateOut;
    private String TypePersonne;
    private Long Id_Horaire;
    private Long Id_Login;
}
