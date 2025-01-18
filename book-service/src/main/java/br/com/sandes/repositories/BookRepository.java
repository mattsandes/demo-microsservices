package br.com.sandes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sandes.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}
