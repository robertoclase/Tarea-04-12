package com.salesianostriana.dam.tarea04_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "numero_factura", unique = true, nullable = false, length = 20)
    private String numeroFactura;

    @Column(name = "fecha_emision", nullable = false)
    private LocalDate fechaEmision;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    @ToString.Exclude
    private Cliente cliente;

    public static Factura crearFactura(String numero, LocalDate fecha, BigDecimal total, Cliente cliente) {
        Factura factura = Factura.builder()
                .numeroFactura(numero)
                .fechaEmision(fecha)
                .total(total)
                .build();
        factura.setCliente(cliente);
        return factura;
    }
}