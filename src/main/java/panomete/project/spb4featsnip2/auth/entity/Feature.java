package panomete.project.spb4featsnip2.auth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import panomete.project.spb4featsnip2.common.entity.BaseEntity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_feature")
@EqualsAndHashCode(callSuper = true)
public class Feature extends BaseEntity {
    private String name;
    private String description;
}