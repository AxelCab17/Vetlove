/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.VetLove.service;

import com.VetLove.domain.RegistroMedico;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface RegistroMedicoService {

    List<RegistroMedico> getRegistrosMedicos();

    RegistroMedico getRegistroMedico(RegistroMedico registroMedico);

    public void delete(RegistroMedico registroMedico);

    public void save(RegistroMedico registroMedico);
}
