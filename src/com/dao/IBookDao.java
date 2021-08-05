package com.dao;

import com.entity.Book;
import com.entity.User;

import java.util.List;

public interface IBookDao {

    Book findUserById(int id);

    List<Book> findAllBooks();


    void saveBooks(Book book);

}
