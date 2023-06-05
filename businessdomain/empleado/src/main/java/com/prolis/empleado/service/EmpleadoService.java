package com.prolis.empleado.service;

import com.prolis.empleado.entities.Empleado;
import com.prolis.empleado.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Optional<List<Empleado>> getAll() {
        return Optional.of(empleadoRepository.findAll());
    }

    public Empleado getEmpleadoById(Integer id) {
        Optional<Empleado> optionalEmpleado = empleadoRepository.findById(id);
        return optionalEmpleado.orElse(null);
    }



}
