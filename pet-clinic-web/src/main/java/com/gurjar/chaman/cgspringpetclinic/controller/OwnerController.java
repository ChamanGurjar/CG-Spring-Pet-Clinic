package com.gurjar.chaman.cgspringpetclinic.controller;

import com.gurjar.chaman.cgspringpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

@Controller
@RequestMapping(value = {"/owners/"})
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "index", "index.html"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @GetMapping("find")
    private String find() {
        return "PageNotFound";
    }
}
