package technifutur.be.university.models;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class DemandeInscriptionForm {
    private Long idDemandeInscription;
    @NotBlank(message="Votre nom ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String NomDemandeur;
    @NotBlank(message="Votre prénom ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String PrenomDemandeur;
    @NotBlank(message="Votre adresse ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String AdresseDemandeur;
    @NotBlank(message="Votre n° de rue ne peut être vide et ne pas doit dépasser 10 caractères !")
    @Size(min=1, max=10)
    private String NoRueDemandeur;
    @NotBlank(message="Votre localité ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String LocaliteDemandeur;
    @NotBlank(message="Votre code postal ne peut être vide et ne pas doit dépasser 10 caractères !")
    @Size(min=1, max=10)
    private String CodePostalDemandeur;
    @NotBlank(message="Votre n° de téléphone ne peut être vide et ne pas doit dépasser 20 caractères !")
    @Size(min=1, max=20)
    private String TelephoneDemandeur;
    @NotBlank(message="Votre email ne peut être vide et ne pas doit dépasser 200 caractères !")
    @Size(min=1, max=200)
    private String EmailDemandeur;
    private LocalDate DateDemande;
    private String CommentairesDemande;
    private Boolean DemandeTraitee;
}
