package com.gurjar.chaman.cgspringpetclinic.repositories;

import com.gurjar.chaman.cgspringpetclinic.model.Pet;
import com.gurjar.chaman.cgspringpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 19-Aug-2020
 */

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
     
}
