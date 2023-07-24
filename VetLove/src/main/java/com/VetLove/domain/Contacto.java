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
@Table(name = "contactanos")
public class Contacto implements Serializable {

    //Version de serializacion 
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contactanos")
    private Long idContactanos;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String mensaje;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String email, String telefono, String mensaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.mensaje = mensaje;

    }

}
