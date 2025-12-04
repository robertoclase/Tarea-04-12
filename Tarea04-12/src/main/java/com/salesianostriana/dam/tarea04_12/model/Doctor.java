package com.salesianostriana.dam.tarea04_12.model;

@Entity
@Table(name = "doctores")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String especialidad;

    @Column(unique = true, length = 10)
    private String licencia;

    private boolean activo = true;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CitaMedica> citas = new ArrayList<>();

    // Constructores
    public Doctor() {}

    public Doctor(String nombre, String especialidad, String licencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.licencia = licencia;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public List<CitaMedica> getCitas() { return citas; }
    public void setCitas(List<CitaMedica> citas) { this.citas = citas; }

    // Métodos helper para la relación
    public void agregarCita(CitaMedica cita) {
        citas.add(cita);
        cita.setDoctor(this);
    }

    public void eliminarCita(CitaMedica cita) {
        citas.remove(cita);
        cita.setDoctor(null);
    }
}