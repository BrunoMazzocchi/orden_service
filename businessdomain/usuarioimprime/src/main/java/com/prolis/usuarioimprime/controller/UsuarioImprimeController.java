package com.prolis.usuarioimprime.controller;

import com.prolis.usuarioimprime.entities.*;
import com.prolis.usuarioimprime.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/usuarioimprime")
public class UsuarioImprimeController {
    @Autowired
    private UsuarioImprimeService usuarioImprimeService;

    //obtiene todos los empleados
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If usuario imprime found return 200 else 404
        return usuarioImprimeService.getAll()
                .map(empleados -> new ResponseEntity<>(empleados, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    //Obtiene el empleado por id
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioImprime> getUsuarioImprime(@PathVariable("id") Integer id) {
        UsuarioImprime usuario = usuarioImprimeService.getUsuarioImprimeById(id);

        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
}
