package model.pet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import model.Entity;

@Getter
@RequiredArgsConstructor
public class Type extends Entity {

    private final String name;
}
