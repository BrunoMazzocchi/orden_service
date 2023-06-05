package com.prolis.tipoorden.controller;

import com.prolis.tipoorden.entities.TipoOrden;
import com.prolis.tipoorden.service.TipoOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/tipoorden")
public class tipoOrdenController {
    @Autowired
    private TipoOrdenService tipoOrdenService;

    //obtiene todos los tipoOrden
    @GetMapping("/getAll")
        public ResponseEntity<?> getAll() {
            // If tipoOrden found return 200 else 404
            return tipoOrdenService.getAll()
                    .map(tipoOrden -> new ResponseEntity<>(tipoOrden, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

        }

        //Obtiene el tipoOrden por id
        @GetMapping("/{id}")
        public ResponseEntity<TipoOrden> getDato(@PathVariable("id") Integer id) {
            TipoOrden dato = tipoOrdenService.gettipoOrdenById(id);

            if (dato == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            return new ResponseEntity<>(dato, HttpStatus.OK);
        }
}
