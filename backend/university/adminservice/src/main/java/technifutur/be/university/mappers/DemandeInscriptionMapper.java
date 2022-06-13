package technifutur.be.university.mappers;

import org.springframework.stereotype.Service;
import technifutur.be.university.models.inscriptions.DemandeInscription;
import technifutur.be.university.models.inscriptions.DemandeInscriptionDto;

@Service
public class DemandeInscriptionMapper {
    public DemandeInscriptionDto entity2Dto(DemandeInscription entity) {
        if(entity == null) {
            return null;
        }
        return DemandeInscriptionDto.builder()
                .idDemandeInscription(entity.getIdDemandeInscription())
                .NomDemandeur(entity.getNomDemandeur())
                .PrenomDemandeur(entity.getPrenomDemandeur())
                .AdresseDemandeur(entity.getAdresseDemandeur())
                .NoRueDemandeur(entity.getNoRueDemandeur())
                .LocaliteDemandeur(entity.getLocaliteDemandeur())
                .CodePostalDemandeur(entity.getCodePostalDemandeur())
                .TelephoneDemandeur(entity.getTelephoneDemandeur())
                .EmailDemandeur(entity.getEmailDemandeur())
                .DateDemande(entity.getDateDemande())
                .CommentairesDemande(entity.getCommentairesDemande())
                .DemandeTraitee(entity.getDemandeTraitee())
                .build();
    }
}
