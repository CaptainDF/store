package com.fire.store.service;

import com.fire.store.dao.UserDao;
import com.fire.store.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public List getAllUsers() {
        Map m = new HashMap<String,Object>(16);
        return userDao.list(m);
    }


    @Override
    public User findUserById(int id) {
        return userDao.get(id);
    }
}
