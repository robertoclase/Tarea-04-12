package com.salesianostriana.dam.tarea04_12.repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Optional<Paciente> findByDni(String dni);
    List<Paciente> findByNombreContainingIgnoreCase(String nombre);

    @Query("SELECT p FROM Paciente p WHERE p.fechaNacimiento BETWEEN :desde AND :hasta")
    List<Paciente> findPacientesPorRangoEdad(
            @Param("desde") LocalDate desde,
            @Param("hasta") LocalDate hasta
    );
}