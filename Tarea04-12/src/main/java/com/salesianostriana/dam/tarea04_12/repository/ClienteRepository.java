package com.salesianostriana.dam.tarea04_12.repository;

import com.salesianostriana.dam.tarea04_12.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
}