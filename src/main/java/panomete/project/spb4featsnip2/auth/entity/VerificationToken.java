package panomete.project.spb4featsnip2.auth.entity;

import jakarta.persistence.*;
import lombok.*;
import panomete.project.spb4featsnip2.common.entity.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_verification_token")
@EqualsAndHashCode(callSuper = true)
public class VerificationToken extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String token;

    @Column(nullable = false)
    private LocalDateTime expiredAt;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "auth_id", nullable = false)
    private Auth auth;

    public VerificationToken(Auth auth) {
        this.auth = auth;
        this.token = UUID.randomUUID().toString();
        this.expiredAt = LocalDateTime.now().plusHours(24);
    }

}
