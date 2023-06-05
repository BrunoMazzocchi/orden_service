package com.prolis.paciente.service;

import com.prolis.paciente.entities.Paciente;
import com.prolis.paciente.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;


    public Optional<List<Paciente>> getAll() {
        return Optional.of(pacienteRepository.findAll());
    }

    public Paciente getPacienteById(Integer id) {
        Optional<Paciente> optionalPaciente = pacienteRepository.findById(id);
        return optionalPaciente.orElse(null);
    }

}
