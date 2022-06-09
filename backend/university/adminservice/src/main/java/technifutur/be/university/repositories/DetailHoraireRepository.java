package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.DetailHoraire;
import java.util.Optional;

public interface DetailHoraireRepository extends JpaRepository<DetailHoraire, Long> {
    Optional<DetailHoraire> findById(Long id);
}
