/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove.service;

import com.VetLove.domain.Contacto;
import java.util.List;

public interface ContactoService {

    List<Contacto> getContactos();

    Contacto getContacto(Contacto contacto);

    public void save(Contacto contacto);
}
