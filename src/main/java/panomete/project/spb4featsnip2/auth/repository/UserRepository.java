package panomete.project.spb4featsnip2.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panomete.project.spb4featsnip2.auth.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
