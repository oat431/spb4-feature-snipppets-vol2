#Base Entity for Database

at entrypoint add the following annotation to enable JPA Auditing:
```java
@EnableJpaAuditing // Enable JPA Auditing for automatic population of auditing fields
@SpringBootApplication
public class Spb4featsnip2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spb4featsnip2Application.class, args);
    }

}

```

base entity class with auditing and soft delete fields:
```java
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false)
    UUID id;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    public boolean isDeleted() {
        return deletedAt != null;
    }
}
```

example entity extending BaseEntity:
```java
package com.panomete.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "products")
@SQLDelete(sql = "UPDATE products SET deleted_at = NOW() WHERE id = ?")
@SQLRestriction("deleted_at IS NULL") 
public class Product extends BaseEntity {

    private String name;
    private Double price;
    // ...
}
```
