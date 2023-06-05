package com.prolis.empleado.repository;

import com.prolis.empleado.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
