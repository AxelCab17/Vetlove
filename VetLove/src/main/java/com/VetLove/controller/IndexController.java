
package com.VetLove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("mensaje", "");
        return "index";
    }
}
