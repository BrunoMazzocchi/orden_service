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
    private int idPaciente;
    private int idIdentificacion;
    private String numIdentificacion;
    private int numExpediente;
    private String numINSS;
    private int idEstadoCivil;
    private String email;
    private int idSexo;
    private int idNacionalidad;
    private int idPaisNac;
    private int idDepartamentoNac;
    private int idMunicipioNac;
    private int idPaisRes;
    private int idDepartamentoRes;
    private int idMunicipioRes;
    private int idTipoSangre;
    private int idProfesiones;
    private int idReligion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNac;
    private String direccionDomiciliar;
    private String telefonoDomiciliar;
    private String telefonoMovil;
    private String activo;
    private String embarazada;
    private String fallecido;
    private int estado;
}
