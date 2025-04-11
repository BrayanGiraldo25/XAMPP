package com.example.apiLibrary2.Servicios;

import com.example.apiLibrary2.models.Prestamo;
import com.example.apiLibrary2.repositorios.PrestamoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoServicio {
    @Autowired
    private PrestamoRepositorio prestamoRepositorio;

    public PrestamoServicio(PrestamoRepositorio prestamoRepositorio) {

        this.prestamoRepositorio = prestamoRepositorio;
    }

    // Recuperar todos los prestamos, en una lista
    public List<Prestamo> getPrestamo(){
        return prestamoRepositorio.findAll();
    }

    //Guardar prestamo
    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepositorio.save(prestamo);
    }
}
