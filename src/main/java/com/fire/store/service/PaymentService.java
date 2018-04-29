package com.fire.store.service;

import com.fire.store.domain.Payment;
import com.fire.store.domain.User;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
public interface PaymentService {

    void save(Payment payment);

    int update(Payment payment);

    List getAllPayments();

    Payment findPaymentById(int id);
}
