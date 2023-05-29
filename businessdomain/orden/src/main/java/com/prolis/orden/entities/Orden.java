package com.prolis.orden.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorden" , nullable = false, unique = true)
    private int idOrden;

    @Column(name = "N_Orden", length = 11)
    private String numeroOrden;

    @Column(name = "idempleado", nullable = false, unique = true)
    private int idEmpleado;

    @Column(name = "idpaciente", nullable = false, unique = true)
    private int idPaciente;

    @Column(name = "idtiposervicio", nullable = false, unique = true)
    private int idTipoServicio;

    @Column(name = "idtipoorden", nullable = false, unique = true)
    private int idTipoOrden;

    @Column(name = "Asistencia", length = 1)
    private String asistencia;

    @Column(name = "Observaciones", length = 200)
    private String observaciones;

    @Column(name = "fechaorden", nullable = false, unique = true)
    private Date fechaOrden;

    @Column(name = "Activo", length = 1)
    private String activo;

    @Column(name = "fechaimprime", nullable = false, unique = true)
    private Date fechaImprime;

    @Column(name = "idusuarioimprime", nullable = false, unique = true)
    private int idUsuarioImprime;

    @Column(name = "Estado")
    private int estado;

    @Column(name = "Finalizado", length = 1)
    private String finalizado;

    @Column(name = "fechacita", nullable = false, unique = true)
    private Date fechaCita;

    @Column(name = "fechapreporte", nullable = false, unique = true)
    private Date fechaPReporte;
}
