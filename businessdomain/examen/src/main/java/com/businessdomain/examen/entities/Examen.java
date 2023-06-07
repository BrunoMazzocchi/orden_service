package com.businessdomain.examen.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_examenes")
public class Examen {
    public Examen() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexamen", nullable = false, unique = true)
    private int idExamen;

    @Column(name = "idarealabservicio", nullable = false, unique = true)
    private int idAreaLabServicio;

    @Column(name = "idmetodologia", nullable = false, unique = true)
    private int idMetodologia;

    @Column(name = "idcategoriaexamenes", nullable = false, unique = true)
    private int idCategoriaExamenes;

    @Column(name = "idtipomuestra", nullable = false, unique = true)
    private int idTipoMuestra;

    @Column(name = "idunidadmedidas", nullable = false, unique = true)
    private int idUnidadMedidas;

    @Column(name = "idtiporesultado", nullable = false, unique = true)
    private int idTipoResultado;

    @Column(name = "descripcion", length = 50, nullable = false, unique = true)
    private String descripcion;

    @Column(name = "descripcioncorta", length = 25, nullable = false, unique = true)
    private String descripcionCorta;

    @Column(name = "liscode", length = 10, nullable = false, unique = true)
    private String lisCode;

    @Column(name = "conteo", length = 1, nullable = false, unique = true)
    private String conteo;

    @Column(name = "confidencial", length = 1, nullable = false, unique = true)
    private String confidencial;

    @Column(name = "calculado", length = 1, nullable = false, unique = true)
    private String calculado;

    @Column(name = "estado", nullable = false, unique = true)
    private int estado;
}
