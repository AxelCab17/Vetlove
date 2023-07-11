/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove.service;

import com.VetLove.domain.Contacto;
import com.VetLove.domain.Registro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ContactoService {
     public List<Contacto> getContactos;

    // Se obtiene un Categoria, a partir del id de un categoria
    public Contacto getRegistro(Contacto contacto);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Contacto contacto);
}
