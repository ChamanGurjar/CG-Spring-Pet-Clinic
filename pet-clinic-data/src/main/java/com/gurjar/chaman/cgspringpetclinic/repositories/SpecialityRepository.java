package com.gurjar.chaman.cgspringpetclinic.repositories;

import com.gurjar.chaman.cgspringpetclinic.model.PetType;
import com.gurjar.chaman.cgspringpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 19-Aug-2020
 */

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
     
}
