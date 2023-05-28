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
    private int idTipoOrden;

    private String descripcion;
}