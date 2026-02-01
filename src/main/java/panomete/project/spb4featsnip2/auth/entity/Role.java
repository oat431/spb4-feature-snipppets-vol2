package panomete.project.spb4featsnip2.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import panomete.project.spb4featsnip2.common.entity.BaseEntity;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_role")
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {
    private String name;
    private String description;

    // 1 Role มีได้หลาย Feature (เช่น Admin ทำได้ทั้ง create, delete)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_role_feature",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private List<Feature> features;
}
