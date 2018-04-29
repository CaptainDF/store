package com.fire.store;

import com.fire.store.domain.Payment;
import com.fire.store.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void test(){
        Payment p = new Payment();
        p.setAddress("address");
        p.setName("paymentName");
        p.setOrdertime(new Date().toString());
        p.setTelephone("123456789");

        paymentService.save(p);
    }
}
