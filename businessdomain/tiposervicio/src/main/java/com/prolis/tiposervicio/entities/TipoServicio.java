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
    private int idTipoServicio;

    private String descripcion;
}