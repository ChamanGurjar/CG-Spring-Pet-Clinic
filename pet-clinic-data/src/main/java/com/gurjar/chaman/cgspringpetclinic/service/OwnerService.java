package com.gurjar.chaman.cgspringpetclinic.service;

import com.gurjar.chaman.cgspringpetclinic.model.Owner;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 02-Aug-2020
 */

public interface OwnerService extends BaseService<Owner, Long> {
    Owner findByLastName(String lastName);
}
