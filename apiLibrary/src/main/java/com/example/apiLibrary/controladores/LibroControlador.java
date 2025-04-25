package com.example.apiLibrary.controladores;

import com.example.apiLibrary.modelos.Libro;
import com.example.apiLibrary.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroControlador {
    // Inyectar a LibroServicio
    @Autowired
    private LibroServicio libroServicio;

    @GetMapping
    public List<Libro> getAllLibros(){
        return libroServicio.getLibros();
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro){
        return libroServicio.saveLibro(libro);
    }

    @GetMapping("/{idlibro}")
    public ResponseEntity<Libro> getLibroId(String idlibro) {
        Optional<Libro> libro = libroServicio.getLibroPorId(idlibro);
        return libro.map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }

    // Actualizar un libro por idlibro
    @PutMapping("/{idlibro}")
    public Libro updateLibroId(@PathVariable String idlibro, @RequestBody Libro libro){
        return libroServicio.updateLibroporId(idlibro, libro);
    }

    // Eliminar el libro por idlibro
    @DeleteMapping("/{idlibro}")
    public void deleteLibroId(@PathVariable String idlibro){
        libroServicio.deleteLibroPorId(idlibro);
    }
}
