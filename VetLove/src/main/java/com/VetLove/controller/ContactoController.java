package com.VetLove.controller;

import com.VetLove.domain.Contacto;
import com.VetLove.domain.Registro;
import com.VetLove.service.ContactoService;
import com.VetLove.service.RegistroService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ContactoController {

    @RequestMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @Autowired
    ContactoService contactoService;

    @GetMapping("contacto/contactanos")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso contacto/listado");
        List<Contacto> contactos = contactoService.getContactos();
        model.addAttribute("contactos", contactos);
        return "contacto/contactanos";
    }

    @PostMapping("/guardarContacto")
    public String contactoGuardar(@ModelAttribute("contacto") Contacto contacto) {
        contactoService.save(contacto);
        return "redirect:/contacto"; // Redirecciona a la página de contacto después de guardar
    }

}
