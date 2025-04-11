package com.example.apiLibrary2.repositorios;

import com.example.apiLibrary2.models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {
}
