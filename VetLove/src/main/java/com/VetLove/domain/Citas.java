package com.VetLove.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "citas")
public class Citas implements Serializable {

    //Version de serializacion 
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_citas")
    private Long idCitas;
    private String nombre;
    private String apellido;
    private String cedula;
    private String especialidad;
    private Date fechaDisponible;
    private String nombreMascota;
    private boolean activo;

    public Citas() {
    }

    public Citas(String nombre, String apellido, String cedula, String especialidad, Date fechaDisponible, String nombreMascota, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.fechaDisponible = fechaDisponible;
        this.nombreMascota = nombreMascota;
        this.activo = activo;
    }

}
