package com.gurjar.chaman.cgspringpetclinic.model;

import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @since  - 26-Jul-2020
 */

public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
