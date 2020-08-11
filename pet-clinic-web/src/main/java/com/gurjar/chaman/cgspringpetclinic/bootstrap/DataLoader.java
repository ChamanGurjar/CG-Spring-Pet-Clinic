package com.gurjar.chaman.cgspringpetclinic.bootstrap;

import com.gurjar.chaman.cgspringpetclinic.model.Owner;
import com.gurjar.chaman.cgspringpetclinic.model.Vet;
import com.gurjar.chaman.cgspringpetclinic.service.OwnerService;
import com.gurjar.chaman.cgspringpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 11-Aug-2020
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Chaman");
        owner.setLastName("Singh");

        Owner owner2 = new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Abhijeet ");
        owner2.setLastName("Singh");

        ownerService.save(owner);
        ownerService.save(owner2);

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Bruno");
        vet.setLastName("mix");

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Sam");
        vet2.setLastName("macy");

        vetService.save(vet);
        vetService.save(vet2);

        System.out.println("Bootstrap Data loaded on startup.");
    }
}
