package com.prolis.paciente.controller;

import com.prolis.paciente.entities.Paciente;
import com.prolis.paciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/paciente")
public class pacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If pacientes found return 200 else 404
        return pacienteService.getAll()
                .map(pacientes -> new ResponseEntity<>(pacientes, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> getPacienteById(@PathVariable("id") Integer id) {
        Paciente paciente = pacienteService.getPacienteById(id);

        if (paciente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(paciente, HttpStatus.OK);
    }
}
