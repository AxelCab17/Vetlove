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
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class RegistroController {

    @RequestMapping("/registro")
    public String registro() {

        return "registro";
    }

    @Autowired
    RegistroService registroService;

    @GetMapping("registro/registro")
    public String inicio(Model model) {
        log.info("Consumiendo el recurso registro/listado");
        List<Registro> registros = registroService.getRegistros(false);
        model.addAttribute("registros", registros);
        return "registro/registro";

    }

    @PostMapping("/guardar")
    public String registroGuardar(Registro registro) {
        registroService.save(registro);
        System.out.println("nombre" + registro);

        return "registro";
    }
}
