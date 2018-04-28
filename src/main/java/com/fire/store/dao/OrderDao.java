package com.fire.store.dao;

import com.fire.store.domain.Order;
import com.fire.store.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by DZA on 2018/4/27.
 */
@Mapper
public interface OrderDao {

    void save(Order order);

    int update(Order order);

    User get(int id);

    List<Order> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
