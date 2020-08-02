package com.gurjar.chaman.cgspringpetclinic.model;

/**
 * @author - Chaman Gurjar
 * @since  - 26-Jul-2020
 */

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    //    Getters And Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
