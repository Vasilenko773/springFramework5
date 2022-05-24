package com.bootstrap;

import com.domain.ProductOwner;
import com.domain.Program;
import com.domain.Programmer;
import com.repository.RepositoryOwner;
import com.repository.RepositoryProgram;
import com.repository.RepositoryProgrammer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final RepositoryProgram programs;
    private final RepositoryProgrammer programmers;
    private final RepositoryOwner productOwners;

    public BootStrapData(RepositoryProgram programs, RepositoryProgrammer programmers, RepositoryOwner productOwners) {
        this.programs = programs;
        this.programmers = programmers;
        this.productOwners = productOwners;
    }

    @Override
    public void run(String... args) {
        ProductOwner owner = new ProductOwner("Soctech");
        Programmer ilya = new Programmer("Ilya", "Java");
        Program serviceUpdateOrder = new Program("UpdaterOrder");
        ilya.addProgram(serviceUpdateOrder);
        serviceUpdateOrder.getProgrammers().add(ilya);

        programmers.save(ilya);
        programs.save(serviceUpdateOrder);

        Program edc = new Program("CryptoProConnection");
        ilya.addProgram(edc);
        edc.getProgrammers().add(ilya);
        programmers.save(ilya);
        programs.save(edc);

        owner.getPrograms().add(serviceUpdateOrder);
        owner.getPrograms().add(edc);

        productOwners.save(owner);

        System.out.println("Programmer count in repository = " + programmers.count());
        System.out.println("Program count in repository = " + programs.count());
        System.out.println("Product owner count in repository = " + productOwners.count());
        System.out.println(owner.getPrograms().size());




    }
}
