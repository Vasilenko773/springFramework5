package data.service.map;

import data.model.Person;
import data.service.CRUDService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonMapService extends AbstractMapService<Person, Integer> implements CRUDService<Person, Integer> {

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public Person save(Person object) {
       return super.save(object.getId(), object);
    }

    @Override
    public Person findById(Integer id) {
        return super.findById(id);
    }
}
