package com.example.apiLibrary.servicios;


import com.example.apiLibrary.modelos.Libro;
import com.example.apiLibrary.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServicio {
    // Inyectar el repositorio de LibroServicio para realizar el CRUD
    @Autowired
    private LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }
    // Generar los métodos para el CRUD que serán invocados desde el controlador
    public Libro saveLibro(Libro libro){
        return libroRepositorio.save(libro);
    }

    public List<Libro> getLibros(){
        return libroRepositorio.findAll();
    }

    public Optional<Libro> getLibroPorId(String idlibro){
        return libroRepositorio.findById(idlibro);
    }

    public Libro updateLibroporId(String idlibro, Libro libro){
        if (libroRepositorio.existsById(idlibro)){
            libro.setIdlibro(idlibro);
            return libroRepositorio.save(libro);
        }
        return null;
    }
    // Eliminar un libro por idLibro
    public void deleteLibroPorId(String idlibro){
        libroRepositorio.deleteById(idlibro);
    }


}
