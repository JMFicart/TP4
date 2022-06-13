package technifutur.be.university.models.inscriptions;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder
public class DemandeInscriptionDto {
    private Long idDemandeInscription;
    private String NomDemandeur;
    private String PrenomDemandeur;
    private String AdresseDemandeur;
    private String NoRueDemandeur;
    private String LocaliteDemandeur;
    private String CodePostalDemandeur;
    private String TelephoneDemandeur;
    private String EmailDemandeur;
    private LocalDate DateDemande;
    private String CommentairesDemande;
    private Boolean DemandeTraitee;
}
