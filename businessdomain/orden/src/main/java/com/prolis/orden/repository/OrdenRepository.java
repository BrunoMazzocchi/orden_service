package com.prolis.orden.repository;

import com.prolis.orden.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Integer> {
    Orden save (Orden orden);
    List<Orden> findAll();
}
