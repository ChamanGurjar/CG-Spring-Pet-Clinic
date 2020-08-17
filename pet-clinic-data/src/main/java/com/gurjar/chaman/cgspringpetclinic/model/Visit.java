package com.gurjar.chaman.cgspringpetclinic.model;

import java.time.LocalDate;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 17-Aug-2020
 */

public class Visit extends BaseEntity {

    private LocalDate localDate;
    private String description;
    private Pet pet;


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
