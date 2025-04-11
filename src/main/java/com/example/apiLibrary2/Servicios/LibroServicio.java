package com.example.apiLibrary2.Servicios;

import com.example.apiLibrary2.models.Book;
import com.example.apiLibrary2.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {
    // Inyectar el repositorio de LibroServicio
    @Autowired
    private LibroRepositorio libroRepositorio;

    public LibroServicio(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;

    }
    // Generar los metodos para el CRUD que seran invocados desde el controlador
    public Book saveBook(Book book){

        return libroRepositorio.save(book);
    }

    public List<Book> getBook(){
        return libroRepositorio.findAll();
    }
}
