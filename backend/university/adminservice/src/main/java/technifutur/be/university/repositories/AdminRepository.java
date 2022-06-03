package technifutur.be.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import technifutur.be.university.models.Admin;

import java.util.Optional;

public interface AdminRepository   extends JpaRepository<Admin, Long> {
    Optional<Admin> findById(Long id);
}
