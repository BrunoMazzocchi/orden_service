package com.prolis.tipoorden.service;

import com.prolis.tipoorden.entities.TipoOrden;
import com.prolis.tipoorden.repository.TipoOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TipoOrdenService {
    @Autowired
    private TipoOrdenRepository tipoOrdenRepository;

    public Optional<List<TipoOrden>> getAll() {
        return Optional.of(tipoOrdenRepository.findAll());
    }

    public TipoOrden gettipoOrdenById(Integer id) {
        Optional<TipoOrden> optionaltipoOrden = tipoOrdenRepository.findById(id);
        return optionaltipoOrden.orElse(null);
    }
}
