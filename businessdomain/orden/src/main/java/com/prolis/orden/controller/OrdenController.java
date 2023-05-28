package com.prolis.orden.controller;

import com.prolis.orden.entities.*;
import com.prolis.orden.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orden")
public class OrdenController {
    @Autowired
    private OrdenService ordenService;

    @PostMapping("/save")
    public Orden save(@RequestBody Orden orden) {
        return ordenService.save(orden);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(ordenService.getAll(), HttpStatus.OK);
    }
}
