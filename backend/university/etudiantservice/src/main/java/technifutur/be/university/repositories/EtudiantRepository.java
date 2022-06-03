package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.Etudiant;

import java.util.Optional;

public interface EtudiantRepository  extends JpaRepository<Etudiant, Long> {
    Optional<Etudiant> findById(Long id);
}
