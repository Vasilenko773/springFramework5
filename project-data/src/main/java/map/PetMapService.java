package map;

import model.Owner;
import model.pet.Pet;
import service.CRUDService;

import java.util.AbstractMap;
import java.util.Set;

public class PetMapService extends AbstractMapService<Pet, Integer> implements CRUDService<Pet, Integer> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }
}


