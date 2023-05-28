package com.prolis.orden.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.*;

@Entity
@Data
@Table(name = "tbl_ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrden")
    private int idOrden;
}