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
@Table(name = "registro")
public class Registro implements Serializable {

    //Version de serializacion 
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String nombre;
    private String correo;
    private String contrasena;
    private String repetirContrasena;
    private boolean activo;

    public Registro() {
    }

    public Registro(String nombre, String correo, String contrasena, String repetirContrasena, boolean activo) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.repetirContrasena = repetirContrasena;
        this.activo = activo;
    }

}
