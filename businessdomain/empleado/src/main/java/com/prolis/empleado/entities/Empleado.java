package com.prolis.empleado.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tbl_empleado")
public class Empleado {
    /// Creates a new instance of Empleado
    public Empleado() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEmpleado;
    private Long IdProfesiones;
    private Long IdUsuarioCreacion;
    private Long IdUsuarioEliminacion;
    private Long IdUsuarioModificacion;
    private String FechaCreacion;
    private String FechaModificacion;
    private String FechaEliminacion;
    private Long IdMunicipioRes;
    private Long IdMunicipioNac;
    private Long IdDepartamentoNac;
    private Long IdDepartamentoRes;
    private Long IdPaisNac;
    private Long IdPaisRes;
    private Long IdIdentificacion;
    private Long IdEstadoCivil;
    private Long IdSexo;
    private Long IdNacionalidad;
    private String NumIdentificacion;
    private String NumINSS;
    private String CodMinsa;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private String FechaNac;
    private String EdadIngreso;
    private String Email;
    private String DireccionDomiciliar;
    private String TelefonoDomiciliar;
    private String TelefonoMovil;
    private String FechaContrato;
    private String UrlFoto;
    private String Activo;
    private Integer Estado;
}
