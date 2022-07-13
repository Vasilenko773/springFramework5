package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import ru.service.JavaConfigService;
import ru.service.OwnerConfigJavaService;

@Configuration
@ImportResource("classpath:spring-config.xml")
public class JavaConfiguration {

    @Bean
    OwnerConfigJavaService ownerConfigJavaService() {
        return new OwnerConfigJavaService();
    }

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    JavaConfigService ownerService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("owner");
    }

    @Bean
    JavaConfigService vetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("vet");
    }
}
