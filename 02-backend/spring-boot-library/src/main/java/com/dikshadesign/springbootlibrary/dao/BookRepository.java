package com.dikshadesign.springbootlibrary.dao;

import com.dikshadesign.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {

}
