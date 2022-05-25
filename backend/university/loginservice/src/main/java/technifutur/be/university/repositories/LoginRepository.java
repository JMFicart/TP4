package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.Login;
import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Long>{
    Optional<Login> findByIdentifiant(String identifiant);
}
