
package com.VetLove.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "listamedica")

public class RegistroMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro_medico")
    private Long IdRegistroMedico;
    private String fechaUltimaVisita;
    private String razonUltimaVisita;
    private String examenFisico;
    private String peso;
    private String temperatura;
    private String evaluacionVeterinario;
    private String recomendaciones;

    public RegistroMedico() {
    }

    public RegistroMedico(String fechaUltimaVisita, String razonUltimaVisita, String examenFisico, String peso, String temperatura, String evaluacionVeterinario, String recomendaciones) {
        this.fechaUltimaVisita = fechaUltimaVisita;
        this.razonUltimaVisita = razonUltimaVisita;
        this.examenFisico = examenFisico;
        this.peso = peso;
        this.temperatura = temperatura;
        this.evaluacionVeterinario = evaluacionVeterinario;
        this.recomendaciones = recomendaciones;
    }

}
