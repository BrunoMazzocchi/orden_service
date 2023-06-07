package com.businessdomain.examen.service;

import com.businessdomain.examen.entities.Examen;
import com.businessdomain.examen.repository.ExamenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExamenService {
    @Autowired
    private ExamenRepository examenRepository;

    public Optional<List<Examen>> getAll() {
        return Optional.of(examenRepository.findAll());
    }

    public Examen getExamenById(Integer id) {
        Optional<Examen> optionalExamen = examenRepository.findById(id);
        return optionalExamen.orElse(null);
    }
}
