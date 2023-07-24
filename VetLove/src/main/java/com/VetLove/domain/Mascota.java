package com.VetLove.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "mascota")
public class Mascota implements Serializable {
//Version de serializacion 

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long idMascota;
    private String nombre;
    private String raza;

    public Mascota() {
    }

    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

}
