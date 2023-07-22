/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove.service;

import com.VetLove.domain.Citas;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface CitasService {

    public List<Citas> getCitas(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Citas getCita(Citas citas);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void delete(Citas citas);

    public void save(Citas citas);

}
