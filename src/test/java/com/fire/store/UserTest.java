package com.fire.store;

import com.fire.store.domain.User;
import com.fire.store.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void test(){
//        User u = new User();
//        u.setUsername("jack");
//        u.setPassword("123");
//        u.setEmail("12345@123.com");
//        User user = userService.findUserById(1);
//        System.out.println(user);

        List list = userService.getAllUsers();
        System.out.println(list.size());
    }
}
