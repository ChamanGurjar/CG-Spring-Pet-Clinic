package com.gurjar.chaman.cgspringpetclinic.service.map;

import com.gurjar.chaman.cgspringpetclinic.model.Owner;
import com.gurjar.chaman.cgspringpetclinic.service.OwnerService;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    Owner save(Long id, Owner owner) {
        return super.save(id, owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
