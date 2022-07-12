package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.service.OwnerConfigJavaService;

@Configuration
public class JavaConfiguration {

    @Primary
    @Bean
    OwnerConfigJavaService ownerConfigJavaService() {
        return new OwnerConfigJavaService();
    }
}
