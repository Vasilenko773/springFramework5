package ru.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.beans.factory.annotation.Qualifier;
import service.map.OwnerMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.OwnerService;
import service.PetService;
import service.VetService;
import service.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Сохранение владельцев клиник");
        Owner jon = new Owner("Jon", "Pediqry");
        ownerService.save(jon);

        Owner mrPeet = new Owner("Peet", "Potter");
        ownerService.save(mrPeet);

        System.out.println("Сохранение ветеринаров");
        Vet suzy = new Vet("Suzanna", "Pattison");
        vetService.save(suzy);

        Vet richard = new Vet("Richard", "Kapton");
        vetService.save(richard);
    }
}
