package com.fire.store.service;

import com.fire.store.domain.Order;
import com.fire.store.domain.User;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
public interface OrderService {

    void save(Order order);

    int update(Order order);

    /**
     * 获取所有用户
     */
    List getAllOrders();

    Order findOrderById(int id);
}
