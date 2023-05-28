package com.prolis.usuarioimprime.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_usuarios")
@Data
public class UsuarioImprime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private int idUsuario;

    @Column(name = "IdEmpleado")
    private int idEmpleado;

    @Column(name = "Login", length = 15)
    private String login;

    @Column(name = "Pwd", length = 20)
    private String password;

    @Column(name = "Activo", length = 1)
    private String activo;

    @Column(name = "Estado")
    private int estado;

    @Column(name = "IdUsuarioCreacion")
    private int idUsuarioCreacion;

    @Column(name = "IdUsuarioModificacion")
    private int idUsuarioModificacion;

    @Column(name = "IdUsuarioEliminacion")
    private int idUsuarioEliminacion;

    @Column(name = "FechaCreacion")
    private Date fechaCreacion;

    @Column(name = "FechaModificacion")
    private Date fechaModificacion;

    @Column(name = "FechaEliminacion")
    private Date fechaEliminacion;
}