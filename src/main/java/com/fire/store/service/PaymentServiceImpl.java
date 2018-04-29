package com.fire.store.service;

import com.fire.store.dao.PaymentDao;
import com.fire.store.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public void save(Payment payment) {
        paymentDao.save(payment);
    }

    @Override
    public int update(Payment payment) {
        return paymentDao.update(payment);
    }

    @Override
    public List getAllPayments() {
        Map m = new HashMap<>();
        return paymentDao.list(m);
    }

    @Override
    public Payment findPaymentById(int id) {
        return paymentDao.get(id);
    }
}
