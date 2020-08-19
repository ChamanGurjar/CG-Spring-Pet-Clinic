package com.gurjar.chaman.cgspringpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 17-Aug-2020
 */

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
