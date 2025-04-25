package com.example.apiLibrary.repositorios;

import com.example.apiLibrary.modelos.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {
}
