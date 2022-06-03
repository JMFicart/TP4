package technifutur.be.university.models;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class ProfesseurForm {
    private Long idPersonne;
    @NotBlank(message="Le nom du professeur ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String NomPersonne;
    @NotBlank(message="Le prénom du professeur ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String PrenomPersonne;
    @NotBlank(message="L'adresse du professeur ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String AdressePersonne;
    @NotBlank(message="Le n° de rue du professeur ne peut être vide et ne pas doit dépasser 10 caractères !")
    @Size(min=1, max=10)
    private String NoRuePersonne;
    @NotBlank(message="La localité du professeur ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String LocalitePersonne;
    @NotBlank(message="Le code postal du professeur ne peut être vide et ne pas doit dépasser 10 caractères !")
    @Size(min=1, max=10)
    private String CodePostalPersonne;
    @NotBlank(message="Le n° de téléphone du professeur ne peut être vide et ne pas doit dépasser 20 caractères !")
    @Size(min=1, max=20)
    private String TelephonePersonne;
    @NotBlank(message="L'email du professeur ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String EmailPersonne;
    @NotBlank(message="La date d'entrée du professeur ne peut être vide !")
    private LocalDate DateIn;
    private LocalDate DateOut;
    private String TypePersonne;
    private Long Id_Horaire;
    private Long Id_Login;
}
