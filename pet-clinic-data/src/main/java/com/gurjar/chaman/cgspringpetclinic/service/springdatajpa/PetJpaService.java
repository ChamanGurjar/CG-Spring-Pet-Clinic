package com.gurjar.chaman.cgspringpetclinic.service.springdatajpa;

import com.gurjar.chaman.cgspringpetclinic.model.Pet;
import com.gurjar.chaman.cgspringpetclinic.repositories.PetRepository;
import com.gurjar.chaman.cgspringpetclinic.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 19-Aug-2020
 */

@Service
@Profile("springdatajpa")
public class PetJpaService implements PetService {

    private final PetRepository petRepository;

    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
