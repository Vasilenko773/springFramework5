package data.service.map;

import data.model.Owner;
import data.service.OwnerService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Primary
public class OwnerMapService extends AbstractMapService<Owner, Integer> implements OwnerService {


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
        return super.save(object);
    }

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return super.findAll().stream().filter(i -> i.getLastName().equals(lastName)).findFirst().orElse(
                new Owner(null, null, null, null));
    }
}
