/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.VetLove.controller;

import com.VetLove.domain.Citas;
import com.VetLove.domain.Registro;
import com.VetLove.service.CitasService;
import com.VetLove.service.RegistroService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
@RequestMapping("/citas")
public class CitasController {

    @Autowired
    CitasService citasService;

    @GetMapping("/listadoCitas")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso categoria/listado");
        List<Citas> citas = citasService.getCitas(false);
        model.addAttribute("citas", citas);
        model.addAttribute("totalCitas", citas.size());
        return "/citas/listadoCitas";

    }

    @GetMapping("/nuevaCita")
    public String citasNuevo(Citas citas) {
        return "/citas/modifica";
    }

    @PostMapping("/guardarCita")
    public String citaGuardar(Citas citas) {
        citasService.save(citas);
        System.out.println("nombre" + citas);

        return "citas";
    }

    @GetMapping("/eliminar/{Cedula}")
    public String citasEliminar(Citas citas) {
        citasService.delete(citas);
        return "redirect:/citas/listadoCitas";
    }

    @GetMapping("/modificar/{Cedula}")
    public String citasModificar(Citas citas, Model model) {
        citas = citasService.getCita(citas);
        model.addAttribute("citas", citas);
        return "/citas/modifica";
    }
}
