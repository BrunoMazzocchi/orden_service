package com.prolis.empleado.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Table(name = "tbl_empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempleado", nullable = false, unique = true)
    private int idEmpleado;

    @Column(name = "idprofesiones", nullable = false, unique = true)
    private int idProfesiones;

    @Column(name = "idusuariocreacion", nullable = false, unique = true)
    private int idUsuarioCreacion;

    @Column(name = "idusuarioeliminacion", nullable = false, unique = true)
    private int idUsuarioEliminacion;

    @Column(name = "idusuariomodificacion", nullable = false, unique = true)
    private int idUsuarioModificacion;

    @Column(name = "fechacreacion", nullable = false, unique = true)
    private Date fechaCreacion;

    @Column(name = "fechamodificacion", nullable = false, unique = true)
    private Date fechaModificacion;

    @Column(name = "fechaeliminacion", nullable = false, unique = true)
    private Date fechaEliminacion;

    @Column(name = "idmunicipiores", nullable = false, unique = true)
    private int idMunicipioRes;

    @Column(name = "idmunicipionac", nullable = false, unique = true)
    private int idMunicipioNac;

    @Column(name = "iddepartamentonac", nullable = false, unique = true)
    private int idDepartamentoNac;

    @Column(name = "iddepartamentores", nullable = false, unique = true)
    private int idDepartamentoRes;

    @Column(name = "idpaisnac", nullable = false, unique = true)
    private int idPaisNac;

    @Column(name = "idpaisres", nullable = false, unique = true)
    private int idPaisRes;

    @Column(name = "ididentificacion", nullable = false, unique = true)
    private int idIdentificacion;

    @Column(name = "idestadocivil", nullable = false, unique = true)
    private int idEstadoCivil;

    @Column(name = "idsexo", nullable = false, unique = true)
    private int idSexo;

    @Column(name = "idnacionalidad", nullable = false, unique = true)
    private int idNacionalidad;

    @Column(name = "numidentificacion", length = 20, nullable = false, unique = true)
    private String numIdentificacion;

    @Column(name = "numinss", length = 15, nullable = false, unique = true)
    private String numINSS;

    @Column(name = "codminsa", length = 10, nullable = false, unique = true)
    private String codMinsa;

    @Column(name = "primernombre", length = 50, nullable = false, unique = true)
    private String primerNombre;

    @Column(name = "segundonombre", length = 50, nullable = false, unique = true)
    private String segundoNombre;

    @Column(name = "primerapellido", length = 50, nullable = false, unique = true)
    private String primerApellido;

    @Column(name = "segundoapellido", length = 50, nullable = false, unique = true)
    private String segundoApellido;

    @Column(name = "fechanac", nullable = false, unique = true)
    private Date fechaNacimiento;

    @Column(name = "edadingreso", length = 2, nullable = false, unique = true)
    private String edadIngreso;

    @Column(name = "email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "direcciondomiciliar", length = 150, nullable = false, unique = true)
    private String direccionDomiciliar;

    @Column(name = "telefonodomiciliar", length = 10, nullable = false, unique = true)
    private String telefonoDomiciliar;

    @Column(name = "telefonomovil", length = 10, nullable = false, unique = true)
    private String telefonoMovil;

    @Column(name = "fechacontrato", nullable = false, unique = true)
    private Date fechaContrato;

    @Column(name = "urlfoto", length = 50, nullable = false, unique = true)
    private String urlFoto;

    @Column(name = "activo", length = 1, nullable = false, unique = true)
    private String activo;

    @Column(name = "estado", nullable = false, unique = true)
    private int estado;
}
