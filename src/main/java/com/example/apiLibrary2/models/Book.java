package com.example.apiLibrary2.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
//@Table(name="tblbook")

public class Book {
        @Id
        @Column (length = 5)
    private String idbook;
        @Column(length = 30, nullable = false)
    private String name;
        @Column(nullable = false)
    private LocalDate buydate;
    // Relacion de Libro con Prestamo (de uno a muchos)
    @OneToMany (mappedBy = "book")
    @JsonManagedReference // No genera una lista ciclica en prestamos

    private List<Prestamo> prestamo;

    // Constructores

    public Book(){}

    public Book(String idbook, String name, LocalDate buydate) {
        this.idbook = idbook;
        this.name = name;
        this.buydate = buydate;
    }

    public String getIdbook() {
        return idbook;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBuydate() {
        return buydate;
    }

    public void setIdbook(String idbook) {
        this.idbook = idbook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuydate(LocalDate buydate) {
        this.buydate = buydate;
    }
}
