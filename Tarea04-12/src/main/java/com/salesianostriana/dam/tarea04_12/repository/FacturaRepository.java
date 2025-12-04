package com.salesianostriana.dam.tarea04_12.repository;

import com.salesianostriana.dam.tarea04_12.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
    Optional<Factura> findByNumeroFactura(String numeroFactura);
}