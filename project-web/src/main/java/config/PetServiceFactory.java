package config;

import ru.service.JavaConfigService;
import ru.service.OwnerConfigJavaService;
import ru.service.VetConfigJavaService;

public class PetServiceFactory {

    public JavaConfigService getPetService(String type) {
        return switch (type) {
            case "owner" -> new OwnerConfigJavaService();
            case "vet" -> new VetConfigJavaService();
            default -> new VetConfigJavaService();
        };
    }
}
