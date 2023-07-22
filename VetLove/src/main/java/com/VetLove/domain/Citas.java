/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VetLove.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "citas")
public class Citas implements Serializable {

    //Version de serializacion 
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cedula")
    private Long cedula;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String fechaDisponible;
    private String nombreMascota;
    private boolean activo;

    public Citas() {
    }

    public Citas(String nombre, String apellido, String especialidad, String fechaDisponible,String nombreMascota,boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.fechaDisponible = fechaDisponible;
        this.nombreMascota = nombreMascota;
        this.activo= activo;
    }

}
