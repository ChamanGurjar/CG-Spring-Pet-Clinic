package com.gurjar.chaman.cgspringpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author - Chaman Gurjar
 * @since  - 26-Jul-2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;

}
