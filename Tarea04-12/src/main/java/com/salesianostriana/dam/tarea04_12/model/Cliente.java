package com.salesianostriana.dam.tarea04_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(unique = true, length = 100)
    private String email;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Builder.Default
    @ToString.Exclude
    private List<Factura> facturas = new ArrayList<>();

    public void agregarFactura(Factura factura) {
        if (factura != null) {
            facturas.add(factura);
            factura.setCliente(this);
        }
    }

    public static Cliente crearCliente(String nombre, String email) {
        return Cliente.builder()
                .nombre(nombre)
                .email(email)
                .build();
    }
}