package com.prolis.ordendetalle.service;

import com.prolis.ordendetalle.entities.*;
import com.prolis.ordendetalle.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class OrdenDetalleService {
    @Autowired
    private OrdenDetalleRepository ordenDetalleRepository;

    public Optional<List<OrdenDetalle>> getAll() {
        return Optional.of(ordenDetalleRepository.findAll());
    }

    public OrdenDetalle getOrdenDetalleById(Integer id) {
        Optional<OrdenDetalle> optionalOrdenDetalle = ordenDetalleRepository.findById(id);
        return optionalOrdenDetalle.orElse(null);
    }

    public OrdenDetalle save(OrdenDetalle ordenDetalle) {
        return ordenDetalleRepository.save(ordenDetalle);
    }
}
