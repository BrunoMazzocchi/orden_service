package com.prolis.orden.service;

import com.prolis.orden.entities.*;
import com.prolis.orden.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository ordenRepository;

    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }

    public Optional<List<Orden>> getAll() {
        return Optional.of(ordenRepository.findAll());
    }

    public void deleteOrden(Integer id) {
        Optional<Orden> optionalOrden = ordenRepository.findById(id);

        if (optionalOrden.isPresent()) {
            Orden orden = optionalOrden.get();
            orden.setEstado(3); // Cambia el valor del estado a 3 (eliminado)
            ordenRepository.save(orden); // Guardar los cambios en la base de datos
        }
    }

    public void updateOrden(Orden orden) {
        ordenRepository.save(orden);
    }

}
