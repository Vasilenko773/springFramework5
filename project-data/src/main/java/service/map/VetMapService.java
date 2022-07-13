package service.map;

import model.Vet;
import service.VetService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Integer> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }
}