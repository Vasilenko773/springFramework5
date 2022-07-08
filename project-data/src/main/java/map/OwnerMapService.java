package map;

import model.Owner;
import service.CRUDService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner, Integer> implements CRUDService<Owner, Integer> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }
}
