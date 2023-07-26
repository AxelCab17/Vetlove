/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VetLove.service.impl;

import com.VetLove.dao.RegistroMedicoDao;
import com.VetLove.domain.RegistroMedico;
import com.VetLove.service.RegistroMedicoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroMedicoServiceimpl implements RegistroMedicoService {

    @Autowired
    private RegistroMedicoDao registroMedicoDao;

    @Override
    @Transactional(readOnly = true)
    public List<RegistroMedico> getRegistrosMedicos() {
        return registroMedicoDao.findAll();
    }

    @Override
    public RegistroMedico getRegistroMedico(RegistroMedico registroMedico) {
        return registroMedicoDao.findById(registroMedico.getIdRegistroMedico()).orElse(null);
    }

    @Override
    public void save(RegistroMedico registroMedico) {
        registroMedicoDao.save(registroMedico);
    }

    @Override
    public void delete(RegistroMedico registroMedico) {
        registroMedicoDao.delete(registroMedico);
    }
}
