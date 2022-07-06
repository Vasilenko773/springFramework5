package model.pet;

import model.Entity;
import model.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pet extends Entity {

    private Type type;
    private Owner owner;
    private String name;
}
