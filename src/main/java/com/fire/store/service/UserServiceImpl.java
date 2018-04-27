package com.fire.store.service;

import com.fire.store.dao.UserDao;
import com.fire.store.dao.UserDaoImpl;
import com.fire.store.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void create(int id, String name, String password) {
        userDao.create(name,password);
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List getAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUser() {

    }

    @Override
    public User findUserById(int id) {
        return null;
    }
}
