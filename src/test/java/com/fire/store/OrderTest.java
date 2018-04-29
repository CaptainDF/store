package com.fire.store;

import com.fire.store.domain.Order;
import com.fire.store.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void test(){
        Order o = new Order();
        o.setCount(10);
        o.setItemId("123");
        o.setOrderId("456");
        o.setSubtotal(100);
        orderService.save(o);

    }

    @Test
    public void test1(){
//        List list = orderService.getAllOrders();
//        System.out.println(list);

        Order o = orderService.findOrderById(1);
        System.out.println(o);
    }
}
