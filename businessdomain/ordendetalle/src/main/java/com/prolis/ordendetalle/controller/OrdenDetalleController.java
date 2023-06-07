package com.prolis.ordendetalle.controller;

import com.prolis.ordendetalle.entities.*;
import com.prolis.ordendetalle.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = {"http://localhost:4200"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
@RestController
@RequestMapping("/ordendetalle")
public class OrdenDetalleController {
    @Autowired
    private OrdenDetalleService ordenDetalleService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        // If ordenDetalles found return 200 else 404
        return ordenDetalleService.getAll()
                .map(ordenDetalles -> ResponseEntity.ok().body(ordenDetalles))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrdenDetalleById(@PathVariable("id") Integer id) {
        OrdenDetalle ordenDetalle = ordenDetalleService.getOrdenDetalleById(id);

        if (ordenDetalle == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(ordenDetalle, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> createOrdenDetalle(@RequestBody OrdenDetalle ordenDetalle) {
        String nOrden = "";
        // Gets all ordens and check the last orden number
        List<OrdenDetalle> ordenDetalles = ordenDetalleService.getAll().get();
        ordenDetalle.setActivo("Y");
        // If there are no orden number, set orden number to 20230606001
        if(ordenDetalles.isEmpty()) {
            Date date = new Date();
            nOrden = date.getYear() + String.valueOf(date.getMonth()) + date.getDay() + "001";
        } else {
            // Get the last orden number
            nOrden = ordenDetalles.get(ordenDetalles.size() - 1).getNOrden();
            // Get the last 3 digits of the orden number
            String last3Digits = nOrden.substring(nOrden.length() - 3);
            // Sums 1 to the last 3 digits, if the result is 1000, set the last3Digits to 001
            if(Integer.parseInt(last3Digits) + 1 == 1000) {
                last3Digits = "001";
            } else {
                last3Digits = String.valueOf(Integer.parseInt(last3Digits) + 1);
            }
            Date date = new Date();

            // Get the orden number without the last 3 digits
            nOrden = date.getYear() + String.valueOf(date.getMonth()) + date.getDay();
            // Concatenate the orden number with the last 3 digits
            nOrden = nOrden + last3Digits;
        }

        ordenDetalle.setNOrden(nOrden);
        ordenDetalleService.save(ordenDetalle);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
