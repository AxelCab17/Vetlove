
package com.VetLove.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
public class ContactoController {
    
    @RequestMapping("/contacto")
    public String contacto() {
     
        return "contacto";
    }
    
}
