package com.salesianostriana.dam.tarea04_12.repository;

import com.salesianostriana.dam.tarea04_12.model.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Long> {
}
