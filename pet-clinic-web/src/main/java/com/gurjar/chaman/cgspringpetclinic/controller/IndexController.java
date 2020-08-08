package com.gurjar.chaman.cgspringpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author - Chaman Gurjar
 * @version - 1.0.0 - 08-Aug-2020
 */

@Controller
public class IndexController {

    @GetMapping({"", "/", "index"})
    public String index() {
        return "index";
    }
}
