package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.inscriptions.DemandeInscription;

import java.util.Optional;

public interface DemandeInscriptionRepository  extends JpaRepository<DemandeInscription, Long> {
    Optional<DemandeInscription> findById(Long id);
}
