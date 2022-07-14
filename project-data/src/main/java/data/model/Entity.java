package data.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Entity implements Serializable {

    private Integer id;

    public Entity(Integer id) {
        this.id = id;
    }
}
