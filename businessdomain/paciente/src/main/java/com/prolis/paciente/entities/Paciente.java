package com.prolis.paciente.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.*;

@Entity
@Data
@Table(name = "tbl_paciente")
public class Paciente {
    /// Creates a new instance of Paciente
    public Paciente() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaciente", nullable = false, unique = true)
    private int idPaciente;

    @Column(name = "ididentificacion", nullable = false, unique = true)
    private int idIdentificacion;

    @Column(name = "numidentificacion", length = 20, nullable = false, unique = true)
    private String numIdentificacion;

    @Column(name = "numexpediente", nullable = false, unique = true)
    private int numExpediente;

    @Column(name = "numinss", length = 15, nullable = false, unique = true)
    private String numINSS;

    @Column(name = "idestadocivil", nullable = false, unique = true)
    private int idEstadoCivil;

    @Column(name = "email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "idsexo", nullable = false, unique = true)
    private int idSexo;

    @Column(name = "idnacionalidad", nullable = false, unique = true)
    private int idNacionalidad;

    @Column(name = "idpaisnac", nullable = false, unique = true)
    private int idPaisNac;

    @Column(name = "iddepartamentonac", nullable = false, unique = true)
    private int idDepartamentoNac;

    @Column(name = "idmunicipionac", nullable = false, unique = true)
    private int IdMunicipioNac;

    @Column(name = "idpaisres", nullable = false, unique = true)
    private int idPaisRes;

    @Column(name = "iddepartamentores", nullable = false, unique = true)
    private int idDepartamentoRes;

    @Column(name = "idmunicipiores", nullable = false, unique = true)
    private int idMunicipioRes;

    @Column(name = "idtiposangre", nullable = false, unique = true)
    private int idTipoSangre;

    @Column(name = "idprofesiones", nullable = false, unique = true)
    private int idProfesiones;

    @Column(name = "idreligion", nullable = false, unique = true)
    private int idReligion;

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

    @Column(name = "direcciondomiciliar", length = 150, nullable = false, unique = true)
    private String direccionDomiciliar;

    @Column(name = "telefonodomiciliar", length = 10, nullable = false, unique = true)
    private String telefonoDomiciliar;

    @Column(name = "telefonomovil", length = 10, nullable = false, unique = true)
    private String telefonoMovil;

    @Column(name = "activo", length = 1, nullable = false, unique = true)
    private String activo;

    @Column(name = "emabrazada", length = 1, nullable = false, unique = true)
    private String emabrazada;

    @Column(name = "fallecido", length = 1, nullable = false, unique = true)
    private String fallecido;

    @Column(name = "estado", nullable = false, unique = true)
    private int estado;

}
