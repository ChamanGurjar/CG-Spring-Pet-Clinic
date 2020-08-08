package com.gurjar.chaman.cgspringpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

@Controller
@RequestMapping(value = {"/owner/"})
public class OwnerController {

    @GetMapping({"", "index", "index.html"})
    public String listOfOwners() {
        return "owners/index";
    }
}
