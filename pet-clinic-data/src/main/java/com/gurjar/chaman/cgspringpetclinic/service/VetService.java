package com.gurjar.chaman.cgspringpetclinic.service;

import com.gurjar.chaman.cgspringpetclinic.model.Vet;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 02-Aug-2020
 */

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
