package com.gurjar.chaman.cgspringpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 17-Aug-2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

}
