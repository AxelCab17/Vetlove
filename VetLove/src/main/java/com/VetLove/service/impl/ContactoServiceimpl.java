/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VetLove.service.impl;

import com.VetLove.dao.ContactoDao;
import com.VetLove.domain.Contacto;
import com.VetLove.service.ContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactoServiceimpl implements ContactoService {

    @Autowired
    private ContactoDao contactoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getContactos() {
        return contactoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Contacto getContacto(Long email) {
        return contactoDao.findById(email).orElse(null);
    }

    @Override
    public void save(Contacto contacto) {
        contactoDao.save(contacto);
    }

}
