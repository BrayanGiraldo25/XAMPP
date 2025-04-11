package com.example.apiLibrary2.Controlador;

import com.example.apiLibrary2.Servicios.LibroServicio;
import com.example.apiLibrary2.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Libros")
public class LibroControlador {
    // Inyectar a Libro Servicio
    @Autowired
    private LibroServicio libroServicio;

    @GetMapping
    public List<Book> getAllBooks(){
        return libroServicio.getBook();
    }

    @PostMapping
    public Book createLibro(@RequestBody Book book){
        return libroServicio.saveBook(book);
    }
}
