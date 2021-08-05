package com.dao;

import com.entity.User;

import java.util.List;

public interface IUserDao {

    User findUserById(int id);

    List<User> findAllUsers();

    User findUsersByUserName();

    void saveUser(User user);

}
