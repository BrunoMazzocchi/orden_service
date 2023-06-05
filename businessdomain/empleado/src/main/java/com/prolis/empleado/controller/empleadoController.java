package com.prolis.empleado.controller;

import com.prolis.empleado.entities.Empleado;
import com.prolis.empleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/empleado")
public class empleadoController {
    @Autowired
    private EmpleadoService empleadoService;

//obtiene todos los empleados
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If empleados found return 200 else 404
        return empleadoService.getAll()
                .map(empleados -> new ResponseEntity<>(empleados, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    //Obtiene el empleado por id
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getDato(@PathVariable("id") Integer id) {
        Empleado dato = empleadoService.getEmpleadoById(id);

        if (dato == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dato, HttpStatus.OK);
    }
}
