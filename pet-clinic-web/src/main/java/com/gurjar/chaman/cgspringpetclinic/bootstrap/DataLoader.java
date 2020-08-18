package com.gurjar.chaman.cgspringpetclinic.bootstrap;

import com.gurjar.chaman.cgspringpetclinic.model.Owner;
import com.gurjar.chaman.cgspringpetclinic.model.Pet;
import com.gurjar.chaman.cgspringpetclinic.model.PetType;
import com.gurjar.chaman.cgspringpetclinic.model.Vet;
import com.gurjar.chaman.cgspringpetclinic.service.OwnerService;
import com.gurjar.chaman.cgspringpetclinic.service.PetTypeService;
import com.gurjar.chaman.cgspringpetclinic.service.VetService;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 11-Aug-2020
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner = new Owner();
        owner.setFirstName("Chaman");
        owner.setLastName("Singh");
        owner.setAddress("2123 Meerut");
        owner.setCity("Meerut");
        owner.setTelephone("1231231231");

        Pet jack = new Pet();
        jack.setPetType(savedDogPetType);
        jack.setOwner(owner);
        jack.setBirthDate(LocalDate.now());
        jack.setName("JACK");
        owner.getPets().add(jack);

        Owner owner2 = new Owner();
        owner2.setFirstName("Abhijeet ");
        owner2.setLastName("Singh");
        owner.setAddress("2123 Meerut");
        owner.setCity("Meerut");
        owner.setTelephone("4561231231");

        Pet catty = new Pet();
        catty.setPetType(savedCatPetType);
        catty.setOwner(owner);
        catty.setBirthDate(LocalDate.now());
        catty.setName("CATTY");
        owner2.getPets().add(catty);

        ownerService.save(owner);
        ownerService.save(owner2);

        Vet vet = new Vet();
        vet.setFirstName("Bruno");
        vet.setLastName("mix");

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("macy");

        vetService.save(vet);
        vetService.save(vet2);

        System.out.println("Bootstrap Data loaded on startup.");
    }
}
