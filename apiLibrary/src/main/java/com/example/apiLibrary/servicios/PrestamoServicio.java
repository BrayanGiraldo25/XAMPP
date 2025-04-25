package com.example.apiLibrary.servicios;

import com.example.apiLibrary.modelos.Prestamo;
import com.example.apiLibrary.repositorios.PrestamoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoServicio {
    // Inyectar el repositorio de PrestamoRepositorio
    @Autowired
    private PrestamoRepositorio prestamoRepositorio;

    public PrestamoServicio(PrestamoRepositorio prestamoRepositorio) {
        this.prestamoRepositorio = prestamoRepositorio;
    }
    // Generar los métodos para el CRUD
    // Recuperar todos los prestamos, en una lista
    public List<Prestamo> getPrestamos(){
        return prestamoRepositorio.findAll();
    }
    // Guardar un prestamo
    public Prestamo savePrestamo(Prestamo prestamo){
        return prestamoRepositorio.save(prestamo);
    }

}
