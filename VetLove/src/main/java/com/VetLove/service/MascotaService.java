/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove.service;

import com.VetLove.domain.Mascota;
import java.util.List;

public interface MascotaService {

    List<Mascota> getMascotas();

    Mascota getMascota(Mascota mascota);

    public void save(Mascota mascota);
}
