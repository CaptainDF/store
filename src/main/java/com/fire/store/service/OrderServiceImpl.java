package com.fire.store.service;

import com.fire.store.dao.OrderDao;
import com.fire.store.dao.UserDao;
import com.fire.store.domain.Order;
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
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public int update(Order order) {
        return orderDao.update(order);
    }

    @Override
    public List getAllOrders() {
        Map m = new HashMap<>();
        return orderDao.list(m);
    }

    @Override
    public Order findOrderById(int id) {
        return orderDao.get(id);
    }
}
