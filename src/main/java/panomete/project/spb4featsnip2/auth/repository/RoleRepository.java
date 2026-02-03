package panomete.project.spb4featsnip2.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panomete.project.spb4featsnip2.auth.entity.Role;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByName(String name);
}
