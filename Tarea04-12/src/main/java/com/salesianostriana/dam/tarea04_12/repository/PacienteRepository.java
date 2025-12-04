package com.salesianostriana.dam.tarea04_12.repository;

import com.salesianostriana.dam.tarea04_12.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {


}