package com.example.apiLibrary.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
//@Table(name="tbllibro")
public class Libro {
    @Id
    @Column(length = 5)
    private String idlibro;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private LocalDate fechacompra;
    // Relación de Libro con Prestamo (de uno a muchos)
    @OneToMany (mappedBy = "libro")
    @JsonManagedReference // No genera una lista cíclica en prestamo
    private List<Prestamo> prestamos;

    // Constructores
    public Libro(){}

    public Libro(String idlibro, String nombre, LocalDate fechacompra) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.fechacompra = fechacompra;
    }

    public String getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(LocalDate fechacompra) {
        this.fechacompra = fechacompra;
    }
}
