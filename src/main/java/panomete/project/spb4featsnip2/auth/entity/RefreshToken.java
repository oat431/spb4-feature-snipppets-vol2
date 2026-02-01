package panomete.project.spb4featsnip2.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import panomete.project.spb4featsnip2.common.BaseEntity;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_refresh_token")
@EqualsAndHashCode(callSuper = true)
public class RefreshToken extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String token;

    @Column(nullable = false)
    private LocalDateTime expiredAt;

    private Boolean isRevoke = false; // เอาไว้สั่งแบน Token นี้

    // เชื่อมกลับไปหาเจ้าของ Token
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auth_id")
    private Auth auth;
}
