package com.example.apiLibrary2.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Prestamo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDate fechaprestamo;
    private LocalDate fechaDevolucion;

    @ManyToOne
    @JsonBackReference // No se genera informacion ciclicla
    @JoinColumn(referencedColumnName = "idBook")
    private Book book;


    public Prestamo(Long id, LocalDate fechaprestamo, LocalDate fechaDevolucion) {
        this.id = id;
        this.fechaprestamo = fechaprestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
