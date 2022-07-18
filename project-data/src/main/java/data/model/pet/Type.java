package data.model.pet;

import data.model.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class Type extends Entity {

    private final String name;

    public Type(String name) {
        this.name = name;
    }
}
