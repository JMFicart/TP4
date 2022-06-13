package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.cours.Cours;
import java.util.Optional;

public interface CoursRepository extends JpaRepository<Cours, Long> {
    Optional<Cours> findById(Long id);
}
