/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VetLove.service.impl;

import com.VetLove.dao.MascotaDao;
import com.VetLove.domain.Mascota;
import com.VetLove.service.MascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MascotaServiceimpl implements MascotaService {
    
    @Autowired
    private MascotaDao mascotaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Mascota> getMascotas() {
        return mascotaDao.findAll();
    }
    
    @Override
    public Mascota getMascota(Mascota mascota) {
        return mascotaDao.findById(mascota.getIdMascota()).orElse(null);
    }
    
    @Override
    public void save(Mascota mascota) {
        mascotaDao.save(mascota);
    }
    
    @Override
    @Transactional
    public void delete(Mascota mascota) {
        mascotaDao.delete(mascota);
    }
    
}
