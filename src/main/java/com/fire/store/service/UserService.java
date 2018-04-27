package com.fire.store.service;

import com.fire.store.domain.User;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
public interface UserService {

    void save(User user);

    int update(User user);

    /**
     * 获取所有用户
     */
    List getAllUsers();

    User findUserById(int id);
}
