package com.gurjar.chaman.cgspringpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

@Controller
@RequestMapping(value = {"/vets", "/vets/"})
public class VetController {

    @GetMapping({"", "index", "index.html"})
    public String listVets() {
        return "vets/index";
    }
}
