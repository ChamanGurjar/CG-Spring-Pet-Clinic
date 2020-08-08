package com.gurjar.chaman.cgspringpetclinic.service.map;

import com.gurjar.chaman.cgspringpetclinic.model.Vet;
import com.gurjar.chaman.cgspringpetclinic.service.BaseService;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements BaseService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    Vet save(Long id, Vet vet) {
        return super.save(id, vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}