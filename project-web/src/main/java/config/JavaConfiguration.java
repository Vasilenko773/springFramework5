package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.service.OwnerConfigJavaService;

@Configuration
public class JavaConfiguration {

    @Bean
    OwnerConfigJavaService ownerConfigJavaService() {
        return new OwnerConfigJavaService();
    }
}
