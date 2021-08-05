package com.service;

import com.entity.Book;
import com.entity.User;

import java.util.List;

public interface IBookService {

    void borrow(User user, Book book);

}
