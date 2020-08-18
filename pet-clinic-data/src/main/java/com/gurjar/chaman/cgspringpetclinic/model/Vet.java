package com.gurjar.chaman.cgspringpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author - Chaman Gurjar
 * @since  - 26-Jul-2020
 */

public class Vet extends Person {

 private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
