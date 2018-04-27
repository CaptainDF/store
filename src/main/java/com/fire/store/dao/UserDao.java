package com.fire.store.dao;

import com.fire.store.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by DZA on 2018/4/27.
 */
@Mapper
public interface UserDao {

    void save(User user);

    int update(User user);

    User get(int id);

    List<User> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
