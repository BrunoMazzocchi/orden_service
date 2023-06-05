package com.prolis.tiposervicio.controller;

import com.prolis.tiposervicio.entities.*;
import com.prolis.tiposervicio.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/tiposervicio")
public class TipoServicioController {
    @Autowired
    private TipoServicioService tipoServicioService;

    //obtiene todos los empleados
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If servicio imprime found return 200 else 404
        return tipoServicioService.getAll()
                .map(empleados -> new ResponseEntity<>(empleados, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    //Obtiene el empleado por id
    @GetMapping("/{id}")
    public ResponseEntity<TipoServicio> getTipoServicio(@PathVariable("id") Integer id) {
        TipoServicio servicio = tipoServicioService.getTipoServicioById(id);

        if (servicio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(servicio, HttpStatus.OK);
    }
}
