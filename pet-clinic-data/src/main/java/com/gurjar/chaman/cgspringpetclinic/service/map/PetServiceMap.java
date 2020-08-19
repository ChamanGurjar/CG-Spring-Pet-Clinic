package com.gurjar.chaman.cgspringpetclinic.service.map;

import com.gurjar.chaman.cgspringpetclinic.model.Pet;
import com.gurjar.chaman.cgspringpetclinic.service.BaseService;
import com.gurjar.chaman.cgspringpetclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

@Service
@Profile({"default", "map"})
public class PetServiceMap extends AbstractMapService<Pet, Long>  implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
