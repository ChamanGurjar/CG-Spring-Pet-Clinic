package com.gurjar.chaman.cgspringpetclinic.service.map;

import com.gurjar.chaman.cgspringpetclinic.model.Pet;
import com.gurjar.chaman.cgspringpetclinic.service.BaseService;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

public class PetServiceMap extends AbstractMapService<Pet, Long>  implements BaseService<Pet, Long> {
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
        return super.save(pet.getId(), pet);
    }

    @Override
    Pet save(Long id, Pet pet) {
        return super.save(id, pet);
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