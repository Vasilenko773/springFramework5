package config;

import model.pet.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.service.JavaConfigService;
import ru.service.OwnerConfigJavaService;

@Configuration
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
    @Primary
    JavaConfigService vetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("vet");
    }
}
