/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.VetLove.controller;

import com.VetLove.domain.Registro;
import com.VetLove.service.RegistroService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    RegistroService registroService;

    @GetMapping("/form")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso categoria/listado");
        List<Registro> registros = registroService.getRegistros(false);
        model.addAttribute("categorias", registros);
        return "/registro/form";

    }

    @PostMapping("/guardar")
    public String registroGuardar(Registro registro) {
        registroService.save(registro);
        return "redirect:/registro/form";
    }

    
}
