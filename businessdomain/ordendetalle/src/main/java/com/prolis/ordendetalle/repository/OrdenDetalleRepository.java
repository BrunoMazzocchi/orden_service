package com.prolis.ordendetalle.repository;

import com.prolis.ordendetalle.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface OrdenDetalleRepository extends JpaRepository<OrdenDetalle, Integer> {
}
