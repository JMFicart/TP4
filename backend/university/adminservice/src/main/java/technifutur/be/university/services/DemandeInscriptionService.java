package technifutur.be.university.services;

import org.springframework.stereotype.Service;
import technifutur.be.university.exceptions.ElementNotFoundException;
import technifutur.be.university.mappers.DemandeInscriptionMapper;
import technifutur.be.university.models.DemandeInscription;
import technifutur.be.university.models.DemandeInscriptionDto;
import technifutur.be.university.models.DemandeInscriptionForm;
import technifutur.be.university.repositories.DemandeInscriptionRepository;
import java.util.List;

@Service
public class DemandeInscriptionService {
    private Long nextIdDemandeInscription = 2L;
    private final DemandeInscriptionRepository cRepo;
    private final DemandeInscriptionMapper mapper;

    public DemandeInscriptionService(DemandeInscriptionRepository cRepo, DemandeInscriptionMapper mapper) {
        this.cRepo = cRepo;
        this.mapper = mapper;
    }

    public DemandeInscriptionDto getAdminById(Long id){
        return cRepo.findById(id).map(mapper::entity2Dto).orElseThrow(() -> new ElementNotFoundException(id, DemandeInscriptionDto.class));
    }

    public List<DemandeInscriptionDto> getAll(){
        return cRepo.findAll().stream().map(mapper::entity2Dto).toList();
    }

    public DemandeInscription insert(DemandeInscriptionForm form){
        DemandeInscription demandeinscription = DemandeInscription.builder()
                .idDemandeInscription(++nextIdDemandeInscription)
                .NomDemandeur(form.getNomDemandeur())
                .PrenomDemandeur(form.getPrenomDemandeur())
                .AdresseDemandeur(form.getAdresseDemandeur())
                .NoRueDemandeur(form.getNoRueDemandeur())
                .LocaliteDemandeur(form.getLocaliteDemandeur())
                .CodePostalDemandeur(form.getCodePostalDemandeur())
                .TelephoneDemandeur(form.getTelephoneDemandeur())
                .EmailDemandeur(form.getEmailDemandeur())
                .DateDemande(form.getDateDemande())
                .CommentairesDemande(form.getCommentairesDemande())
                .DemandeTraitee(form.getDemandeTraitee())
                .build();
        cRepo.save(demandeinscription);
        return demandeinscription;
    }

    public DemandeInscription update(DemandeInscriptionForm form){
        DemandeInscription demandeinscription = DemandeInscription.builder()
                .NomDemandeur(form.getNomDemandeur())
                .PrenomDemandeur(form.getPrenomDemandeur())
                .AdresseDemandeur(form.getAdresseDemandeur())
                .NoRueDemandeur(form.getNoRueDemandeur())
                .LocaliteDemandeur(form.getLocaliteDemandeur())
                .CodePostalDemandeur(form.getCodePostalDemandeur())
                .TelephoneDemandeur(form.getTelephoneDemandeur())
                .EmailDemandeur(form.getEmailDemandeur())
                .DateDemande(form.getDateDemande())
                .CommentairesDemande(form.getCommentairesDemande())
                .DemandeTraitee(form.getDemandeTraitee())
                .build();
        demandeinscription = cRepo.save(demandeinscription);
        return demandeinscription;
    }

    public DemandeInscription delete(DemandeInscriptionForm form){
        DemandeInscription demandeinscription = DemandeInscription.builder()
                .DemandeTraitee(true)
                .build();
        demandeinscription = cRepo.save(demandeinscription);
        return demandeinscription;
    }
}
