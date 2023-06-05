package com.prolis.tiposervicio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tbl_cat_tiposervicio")
public class TipoServicio {
    /// Creates a new instance of TipoServicio
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtiposervicio", nullable = false, unique = true)
    private int idTipoServicio;

    @Column(name = "descripcion", length = 50, nullable = false, unique = true)
    private String descripcion;
}