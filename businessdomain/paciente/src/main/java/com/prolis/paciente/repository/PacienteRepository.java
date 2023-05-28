package com.prolis.paciente.repository;

import com.prolis.paciente.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
