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
        ordenRepository.deleteById(id);
    }

    public void updateOrden(Orden orden) {
        ordenRepository.save(orden);
    }

}
