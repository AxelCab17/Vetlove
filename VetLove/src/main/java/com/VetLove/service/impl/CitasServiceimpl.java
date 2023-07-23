/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VetLove.service.impl;

import com.VetLove.dao.CitasDao;
import com.VetLove.domain.Citas;
import com.VetLove.service.CitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class CitasServiceimpl implements CitasService {

    @Autowired
    private CitasDao citasDao;

    @Override
    @Transactional(readOnly = true)
    public List<Citas> getCitas(boolean activos) {
        List<Citas> lista = citasDao.findAll();

        if (activos) {
            //Para remover las categorias donde activo sea igual a falso
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;
    }

    @Override
    public Citas getCita(Citas citas) {
        return citasDao.findById(citas.getIdCitas()).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Citas citas) {
        citasDao.delete(citas);
    }

    @Override
    @Transactional
    public void save(Citas citas) {
        citasDao.save(citas);
    }

}
