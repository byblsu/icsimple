package com.service.impl;

import com.Annotation.Bean;
import com.entity.Book;
import com.entity.User;
import com.service.IBookService;
import com.service.IUserService;

import java.util.List;
@Bean
public class BookServiceImpl implements IBookService {


    @Override
    public void borrow(User user, Book book) {
        System.out.println(user.getUsername() + "借了" + book.getName());
    }
}
