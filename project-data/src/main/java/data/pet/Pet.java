package data.pet;

import data.model.Entity;
import data.model.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pet extends Entity {

    private Type type;
    private Owner owner;
    private String name;
}
