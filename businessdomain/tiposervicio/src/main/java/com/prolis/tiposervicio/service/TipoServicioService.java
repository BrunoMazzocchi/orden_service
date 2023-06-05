package com.prolis.tiposervicio.service;

import com.prolis.tiposervicio.entities.*;
import com.prolis.tiposervicio.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class TipoServicioService {
    @Autowired
    private TipoServicioRepository tipoServicioRepository;

    public Optional<List<TipoServicio>> getAll() {
        return Optional.of(tipoServicioRepository.findAll());
    }

    public TipoServicio getTipoServicioById(Integer id) {
        Optional<TipoServicio> optionalEmpleado = tipoServicioRepository.findById(id);
        return optionalEmpleado.orElse(null);
    }

}
