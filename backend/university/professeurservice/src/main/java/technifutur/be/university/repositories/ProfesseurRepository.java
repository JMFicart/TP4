package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.Professeur;

import java.util.Optional;

public interface ProfesseurRepository  extends JpaRepository<Professeur, Long> {
    Optional<Professeur> findById(Long id);
}
