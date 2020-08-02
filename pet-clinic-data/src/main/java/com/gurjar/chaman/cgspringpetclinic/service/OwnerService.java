package com.gurjar.chaman.cgspringpetclinic.service;

import com.gurjar.chaman.cgspringpetclinic.model.Owner;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 02-Aug-2020
 */

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
