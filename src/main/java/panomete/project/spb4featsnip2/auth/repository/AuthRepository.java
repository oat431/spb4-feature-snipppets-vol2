package panomete.project.spb4featsnip2.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panomete.project.spb4featsnip2.auth.entity.Auth;

import java.util.Optional;
import java.util.UUID;

public interface AuthRepository extends JpaRepository<Auth, UUID> {
    Optional<Auth> findByUsername(String username);
    boolean existsByUsername(String username);
}
