package com.gurjar.chaman.cgspringpetclinic.model;

/**
 * @author - Chaman Gurjar
 * @since  - 26-Jul-2020
 */

public class PetType extends BaseEntity {

    private String name;

    //    Getters And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
