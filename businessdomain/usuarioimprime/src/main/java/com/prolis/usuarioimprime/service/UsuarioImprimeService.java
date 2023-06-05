package com.prolis.usuarioimprime.service;

import com.prolis.usuarioimprime.entities.*;
import com.prolis.usuarioimprime.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Service
public class UsuarioImprimeService {
    @Autowired
    private UsuarioImprimeRepository usuarioImprimeRepository;

    public Optional<List<UsuarioImprime>> getAll() {
        return Optional.of(usuarioImprimeRepository.findAll());
    }

    public UsuarioImprime getUsuarioImprimeById(Integer id) {
        Optional<UsuarioImprime> optionalEmpleado = usuarioImprimeRepository.findById(id);
        return optionalEmpleado.orElse(null);
    }


}
