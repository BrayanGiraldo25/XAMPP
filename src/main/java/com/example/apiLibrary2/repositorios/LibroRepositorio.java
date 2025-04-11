package com.example.apiLibrary2.repositorios;

import com.example.apiLibrary2.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Book, String> {


}
