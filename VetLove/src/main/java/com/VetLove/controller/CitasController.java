
package com.VetLove.controller;

import com.VetLove.domain.Citas;
import com.VetLove.service.CitasService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
public class CitasController {

    @RequestMapping("/citas")
    public String citas() {
        return "citas";
    }
    
    @Autowired
    CitasService citasService;

    @GetMapping("/ListadoCitas")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso /citas/ListadoCitas");
        List<Citas> citas = citasService.getCitas(false);
        model.addAttribute("citas", citas);
        model.addAttribute("totalCitas", citas.size());
        return "citas/ListadoCitas"; // Eliminamos la barra diagonal inicial ("/")
    }

    @GetMapping("/nuevaCita")
    public String citasNuevo(Citas citas) {
        return "/citas/modifica";
    }

    @PostMapping("/guardarCita")
    public String citaGuardar(Citas citas) {
        citasService.save(citas);
        return "citas"; // También aquí podrías modificar la ruta si es necesario
    }

    @GetMapping("/eliminar/{idCitas}")
    public String citasEliminar(Citas citas) {
        citasService.delete(citas);
        return "redirect:/citas/ListadoCitas";
    }

    @GetMapping("/modificar/{idCitas}")
    public String citasModificar(Citas citas, Model model) {
        citas = citasService.getCita(citas);
        model.addAttribute("citas", citas);
        return "/citas/modifica";
    }
}


