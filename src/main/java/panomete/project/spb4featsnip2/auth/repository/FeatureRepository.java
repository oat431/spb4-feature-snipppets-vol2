package panomete.project.spb4featsnip2.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panomete.project.spb4featsnip2.auth.entity.Feature;

import java.util.UUID;

public interface FeatureRepository extends JpaRepository<Feature, UUID> {
}
