package com.businessdomain.examen.controller;

import com.businessdomain.examen.entities.Examen;
import com.businessdomain.examen.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/examen")
public class examenController {
    @Autowired
    private ExamenService examenService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If examenes found return 200 else 404
        return examenService.getAll()
                .map(examenes -> ResponseEntity.ok().body(examenes))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getExamenById(@PathVariable("id") Integer id) {
        Examen examen = examenService.getExamenById(id);

        if (examen == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(examen, HttpStatus.OK);
    }
}
