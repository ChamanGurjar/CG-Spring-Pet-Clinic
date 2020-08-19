package com.gurjar.chaman.cgspringpetclinic.repositories;

import com.gurjar.chaman.cgspringpetclinic.model.Speciality;
import com.gurjar.chaman.cgspringpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 19-Aug-2020
 */

public interface VetRepository extends CrudRepository<Vet, Long> {
     
}
