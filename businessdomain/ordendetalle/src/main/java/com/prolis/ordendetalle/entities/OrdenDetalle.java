package com.prolis.ordendetalle.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tbl_ordenesdetalle")
public class OrdenDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idordendetalle", nullable = false, unique = true)
    private int idOrdenDetalle;

    @Column(name = "idorden")
    private int idOrden;

    @Column(name = "n_orden", length = 11)
    private String nOrden;

    @Column(name = "idexamen")
    private int idExamen;

    @Column(name = "activo", length = 1)
    private String activo;
}
