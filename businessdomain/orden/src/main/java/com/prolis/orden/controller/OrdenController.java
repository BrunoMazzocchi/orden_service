package com.prolis.orden.controller;

import com.prolis.orden.entities.*;
import com.prolis.orden.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/orden")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;

    @PostMapping("/save")
    public ResponseEntity<String> saveDato(@RequestBody Orden orden) {
        Orden newOrden = ordenService.saveOrden(orden);
        String response = "Dato guardado correctamente ID: " + newOrden.getIdOrden();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteOrden(@PathVariable("id") Integer id){
        // Delete the given orden
        ordenService.deleteOrden(id);
        return new ResponseEntity<>("Delete correctly", HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> updateOrden(@PathVariable("id") Integer id, @RequestBody Orden orden){
        // Update the given orden
        ordenService.updateOrden(orden);
        return new ResponseEntity<>("Update correctly", HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If ordenes found return 200 else 404
        return ordenService.getAll()
                .map(ordenes -> new ResponseEntity<>(ordenes, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }


    @GetMapping("/Orden/{id}")
    public ResponseEntity<Orden> getDato(@PathVariable("id") Integer id) {
        // Get orden by id
        Orden orden = ordenService.getOrdenById(id);

        // If orden not found return 404 else 200
        if (orden == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(orden, HttpStatus.OK);
    }
}
