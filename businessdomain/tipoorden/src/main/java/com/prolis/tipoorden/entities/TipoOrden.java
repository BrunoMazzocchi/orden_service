package com.prolis.tipoorden.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tbl_cat_tipoorden")
public class TipoOrden {
    // Creates a new instance of TipoOrden
    public TipoOrden() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipoorden", nullable = false, unique = true)
    private int idTipoOrden;

    @Column(name = "descripcion", length = 15, nullable = false, unique = true)
    private String descripcion;
}