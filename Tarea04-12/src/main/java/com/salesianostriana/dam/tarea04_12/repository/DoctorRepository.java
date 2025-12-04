package com.salesianostriana.dam.tarea04_12.repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByEspecialidad(String especialidad);
    Optional<Doctor> findByLicencia(String licencia);
    List<Doctor> findByActivoTrue();
    List<Doctor> findByNombreContainingIgnoreCase(String nombre);

    @Query("SELECT d FROM Doctor d WHERE SIZE(d.citas) > :minCitas")
    List<Doctor> findDoctoresConMasDeXCitas(@Param("minCitas") int minCitas);
}