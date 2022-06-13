package technifutur.be.university.models.inscriptions;

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
@Table(name = "DemandeInscription")
public class DemandeInscription {
    @Id
    @Column(name = "Id_DemandeInscription", nullable = false)
    private Long idDemandeInscription;
    @Column(name = "NomDemandeur", nullable = false, length = 200)
    private String NomDemandeur;
    @Column(name = "PrenomDemandeur", nullable = false, length = 200)
    private String PrenomDemandeur;
    @Column(name = "AdresseDemandeur", nullable = false, length = 200)
    private String AdresseDemandeur;
    @Column(name = "NoRueDemandeur", nullable = false, length = 10)
    private String NoRueDemandeur;
    @Column(name = "LocaliteDemandeur", nullable = false, length = 200)
    private String LocaliteDemandeur;
    @Column(name = "CodePostalDemandeur", nullable = false, length = 10)
    private String CodePostalDemandeur;
    @Column(name = "TelephoneDemandeur", nullable = false, length = 20)
    private String TelephoneDemandeur;
    @Column(name = "EmailDemandeur", nullable = false, length = 200)
    private String EmailDemandeur;
    @Column(name = "DateDemande", nullable = false)
    private LocalDate DateDemande;
    @Column(name = "CommentairesDemande", nullable = true, length = 200)
    private String CommentairesDemande;
    @Column(name = "DemandeTraitee")
    private Boolean DemandeTraitee;
}
