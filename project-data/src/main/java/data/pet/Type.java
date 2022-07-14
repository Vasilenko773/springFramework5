package data.pet;

import data.model.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class Type extends Entity {

    private final String name;

    public Type(Integer id, String name) {
        super(id);
        this.name = name;
    }
}
