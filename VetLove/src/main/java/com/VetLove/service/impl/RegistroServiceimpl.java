/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VetLove.service.impl;

import com.VetLove.dao.RegistroDao;
import com.VetLove.domain.Registro;
import com.VetLove.service.RegistroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class RegistroServiceimpl implements RegistroService {

    @Autowired
    private RegistroDao registroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Registro> getRegistros(boolean activos) {
        List<Registro> lista = registroDao.findAll();

        if (activos) {
            //Para remover las categorias donde activo sea igual a falso
            lista.removeIf(x -> !x.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Registro getRegistro(Registro registro) {
        return registroDao.findById(registro.getIdUsuario()).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Registro registro) {
        registroDao.delete(registro);
    }

    @Override
    @Transactional
    public void save(Registro registro) {
        registroDao.save(registro);
    }

}
