package panomete.project.spb4featsnip2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Spb4featsnip2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spb4featsnip2Application.class, args);
    }

}
