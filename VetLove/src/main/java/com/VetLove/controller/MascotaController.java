package com.VetLove.controller;

import com.VetLove.domain.Mascota;
import com.VetLove.service.MascotaService;
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
public class MascotaController {

 

    @RequestMapping("/mascota")
    public String mascota() {
        return "mascota";
    }

 

    @Autowired
    MascotaService mascotaService;

 

    @GetMapping("/ListadoMascota")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso contacto/listado");
        List<Mascota> mascotas = mascotaService.getMascotas();
        model.addAttribute("mascotas", mascotas);
        return "mascota/ListadoMascota";
    }

 

    @PostMapping("/guardarMascota")
    public String mascotaGuardar(@ModelAttribute("mascota") Mascota mascota) {
        mascotaService.save(mascota);
        return "/mascota"; // Redirecciona a la página de contacto después de guardar
    }

 

    @GetMapping("/eliminar/{idMascota}")
    public String mascotaEliminar(Mascota mascota) {
        mascotaService.delete(mascota);
        return "redirect:/ListadoMascota"; // Corregimos la ruta para la redirección
    }

 

    @GetMapping("/modificar/{idMascota}")
    public String mascotaModificar(Mascota mascota, Model model) {
        mascota = mascotaService.getMascota(mascota);
        model.addAttribute("mascota", mascota);
        return "/mascota/modificar"; // Corregimos el nombre de la plantilla
    }

 

}


