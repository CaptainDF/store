package com.fire.store.service;

import com.fire.store.domain.User;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
public interface UserService {
    /**
     * 新增用户
     * @param id
     * @param name
     */
    void create(int id, String name, String password);

    /**
     * 根据id删除用户
     * @param id
     */
    void deleteById(int id);

    /**
     * 获取所有用户
     */
    List getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUser();

    User findUserById(int id);
}
