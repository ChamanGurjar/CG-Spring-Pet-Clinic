package com.gurjar.chaman.cgspringpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 02-Aug-2020
 */

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    Getters And Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
