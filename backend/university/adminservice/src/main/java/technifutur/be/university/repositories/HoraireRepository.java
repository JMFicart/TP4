package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.Horaire;
import java.util.Optional;

public interface HoraireRepository extends JpaRepository<Horaire, Long> {
    Optional<Horaire> findById(Long id);
}
