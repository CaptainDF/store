package com.fire.store.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by DZA on 2018/4/27.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, String password) {
        jdbcTemplate.update("INSERT into user(username,password) values (?,?)",name,password);
    }
}
