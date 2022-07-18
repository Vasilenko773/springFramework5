package data.model.pet;

import data.model.Entity;
import data.model.Owner;
import lombok.Getter;

@Getter
public class Pet extends Entity {

    private Type type;
    private Owner owner;
    private String name;

    public Pet(Type type, Owner owner, String name) {
        this.type = type;
        this.owner = owner;
        this.name = name;
    }
}
