package data.pet;

import data.model.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Type extends Entity {

    private final String name;
}
