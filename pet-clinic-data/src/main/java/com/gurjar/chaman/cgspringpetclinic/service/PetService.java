package com.gurjar.chaman.cgspringpetclinic.service;

import com.gurjar.chaman.cgspringpetclinic.model.Pet;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 02-Aug-2020
 */

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
