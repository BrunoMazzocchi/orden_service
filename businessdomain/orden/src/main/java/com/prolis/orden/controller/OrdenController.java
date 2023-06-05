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
        ordenService.saveOrden(orden);
        return new ResponseEntity<>("Dato guardado correctamente", HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteOrden(@PathVariable("id") Integer id){
        ordenService.deleteOrden(id);
        return new ResponseEntity<>("Delete correctly", HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> updateOrden(@PathVariable("id") Integer id, @RequestBody Orden orden){
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
        Orden dato = ordenService.getOrdenById(id);

        if (dato == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dato, HttpStatus.OK);
    }
}
