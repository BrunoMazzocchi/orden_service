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
    @Column(name = "idusuario", nullable = false, unique = true)
    private int idUsuario;

    @Column(name = "idempleado", nullable = false, unique = true)
    private int idEmpleado;

    @Column(name = "login", length = 15, nullable = false, unique = true)
    private String login;

    @Column(name = "pwd", length = 20, nullable = false, unique = true)
    private String password;

    @Column(name = "activo", length = 1, nullable = false, unique = true)
    private String activo;

    @Column(name = "estado", nullable = false, unique = true)
    private int estado;

    @Column(name = "idusuariocreacion", nullable = false, unique = true)
    private int idUsuarioCreacion;

    @Column(name = "idusuariomodificacion", nullable = false, unique = true)
    private int idUsuarioModificacion;

    @Column(name = "idusuarioeliminacion", nullable = false, unique = true)
    private int idUsuarioEliminacion;

    @Column(name = "fechacreacion", nullable = false, unique = true)
    private Date fechaCreacion;

    @Column(name = "fechamodificacion", nullable = false, unique = true)
    private Date fechaModificacion;

    @Column(name = "fechaeliminacion", nullable = false, unique = true)
    private Date fechaEliminacion;
}