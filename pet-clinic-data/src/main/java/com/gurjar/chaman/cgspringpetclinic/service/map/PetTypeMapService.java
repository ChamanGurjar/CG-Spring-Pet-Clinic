package com.gurjar.chaman.cgspringpetclinic.service.map;

import com.gurjar.chaman.cgspringpetclinic.model.PetType;
import com.gurjar.chaman.cgspringpetclinic.service.PetTypeService;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 17-Aug-2020
 */

public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
