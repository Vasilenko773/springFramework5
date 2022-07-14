package data.pet;

import data.model.Entity;
import data.model.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Pet extends Entity {

    private Type type;
    private Owner owner;
    private String name;

    public Pet(Integer id, Type type, Owner owner, String name) {
        super(id);
        this.type = type;
        this.owner = owner;
        this.name = name;
    }
}
