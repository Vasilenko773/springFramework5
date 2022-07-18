package data.service.map;

import data.model.Entity;

import java.util.*;

public abstract class AbstractMapService<T extends Entity, ID extends Integer> {

    protected Map<Integer, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(nextId());
            }
            map.put(object.getId(), object);
            return object;
        } else {
            throw new NullPointerException("Object cannot be null");
        }
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(i -> i.getValue().equals(object));
    }

    private Integer nextId() {
        return map.keySet().isEmpty() ? 1 : Collections.max(map.keySet()) + 1;
    }
}
