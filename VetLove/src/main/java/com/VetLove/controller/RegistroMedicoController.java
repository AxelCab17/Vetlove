
package com.VetLove.controller;

import com.VetLove.domain.RegistroMedico;
import com.VetLove.service.RegistroMedicoService;
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
public class RegistroMedicoController {

    @RequestMapping("/registroMedico")
    public String registroMedico() {
        return "registroMedico";
    }

    @Autowired
    RegistroMedicoService registroMedicoService;

    @GetMapping("/ListadoRegistroMedico")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso contacto/listado");
        List<RegistroMedico> registrosMedicos = registroMedicoService.getRegistrosMedicos();
        model.addAttribute("registrosMedicos", registrosMedicos);
        return "registromedico/ListadoRegistroMedico";
    }

    @PostMapping("/guardarRegistroMedicoMascota")
    public String registroMedicoGuardar(@ModelAttribute("registroMedico") RegistroMedico registroMedico) {
        registroMedicoService.save(registroMedico);
        return "/registroMedico"; // Redirecciona a la página de contacto después de guardar
    }

    @GetMapping("/eliminarRegistroMedico/{IdRegistroMedico}")
    public String registroMedicoEliminar(RegistroMedico registroMedico) {
        registroMedicoService.delete(registroMedico);
        return "redirect:/ListadoRegistroMedico"; // Corregimos la ruta para la redirección
    }

    @GetMapping("/modificarRegistroMedico/{IdRegistroMedico}")
    public String registroMedicoModificarForm(RegistroMedico registroMedico, Model model) {
        registroMedico = registroMedicoService.getRegistroMedico(registroMedico);
        model.addAttribute("registroMedico", registroMedico);
        return "/registromedico/modificarRegistroMedico"; // Modificar la cadena retornada a "modificar"
    }

}
