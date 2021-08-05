package com.service.impl;

import com.Annotation.Bean;
import com.dao.IUserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.IUserService;
@Bean
public class UserServiceImpl implements IUserService {

    IUserDao userDao = new UserDaoImpl();

    @Override
    public void login() {
        System.out.println("这是登录业务实现方法");
    }

    @Override
    public void regist() {
        userDao.saveUser(new User("1", "12","123",12));
        System.out.println("这是注册业务实现方法");
    }
}
