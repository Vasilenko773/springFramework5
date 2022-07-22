package data.model;

import data.model.pet.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Owner extends Person {

    private Set<Pet> pets = new HashSet<>();
    private Address address;
    private String telephone;

    public Owner(String firstName, String lastName, Address address, String telephone) {
        super(firstName, lastName);
        this.address = address;
        this.telephone = telephone;
    }
}
