package com.reflect;

import com.Annotation.Bean;
import com.dao.IBookDao;
import com.dao.IUserDao;
import com.dao.impl.BookDaoImpl;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.IBookService;
import com.service.IUserService;
import com.service.impl.BookServiceImpl;
import com.service.impl.UserServiceImpl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ApplicationContext<T> {

    private HashMap<Class,Object> beanFactory = new HashMap<>();

    public  T getBean(Class clazz){
        return (T)beanFactory.get(clazz);
    };

    public  void  initContext(){
        InputStream resource = ApplicationContext.class.getClassLoader()
                .getResourceAsStream("config/bean.config");
        Properties properties = new Properties();
        try {
            properties.load(resource);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                beanFactory.put(Class.forName(key.toString()),Class.forName(properties.getProperty(key.toString())).newInstance());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}


