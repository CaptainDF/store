package com.fire.store.service;

import com.fire.store.dao.UserDao;
import com.fire.store.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public User get(int id) {
        return userDao.get(id);
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
