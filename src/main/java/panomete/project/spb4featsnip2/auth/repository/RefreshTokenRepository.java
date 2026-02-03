package panomete.project.spb4featsnip2.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panomete.project.spb4featsnip2.auth.entity.RefreshToken;

import java.util.UUID;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, UUID> {
}
