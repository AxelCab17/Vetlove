
package com.VetLove.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
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
    private Date fechaDisponible;
    private Time horaDisponible;
    private String nombreMascota;
    private boolean activo;

    public Citas() {
    }

    public Citas(Long cedula, String nombre, String apellido, String especialidad, Date fechaDisponible, Time horaDisponible, String nombreMascota, boolean activo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.fechaDisponible = fechaDisponible;
        this.horaDisponible = horaDisponible;
        this.nombreMascota = nombreMascota;
        this.activo = activo;
    }

}
