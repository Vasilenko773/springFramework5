package web.bootstrap;

import data.model.Owner;
import data.model.Vet;
import data.service.OwnerService;
import data.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Сохранение владельцев клиник");
        Owner jon = new Owner(1,"Jon", "Pediqry");

        ownerService.save(jon);
        System.out.println("Сохранение владельцев клиник");
        Owner mrPeet = new Owner(2,"Peet", "Potter");
        ownerService.save(mrPeet);

        System.out.println("Сохранение ветеринаров");
        Vet suzy = new Vet(1,"Suzanna", "Pattison");
        vetService.save(suzy);

        Vet richard = new Vet(2,"Richard", "Kapton");
        vetService.save(richard);
    }
}
