package com.example.apiLibrary.repositorios;

import com.example.apiLibrary.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, String> {
}
