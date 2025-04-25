package com.example.apiLibrary.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fechaprestamo;
    private LocalDate fechadevolucion;
    // Relación con libros de Muchos a Uno
    @ManyToOne
    @JsonBackReference // no se genera inf cíclica
    @JoinColumn(referencedColumnName = "idlibro")
    private Libro libro;

    public Prestamo(){}

    public Prestamo(Long id, LocalDate fechaprestamo, LocalDate fechadevolucion) {
        this.id = id;
        this.fechaprestamo = fechaprestamo;
        this.fechadevolucion = fechadevolucion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public LocalDate getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(LocalDate fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
}
