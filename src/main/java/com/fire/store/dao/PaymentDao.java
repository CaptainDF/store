package com.fire.store.dao;

import com.fire.store.domain.Payment;
import com.fire.store.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by DZA on 2018/4/27.
 */
@Mapper
public interface PaymentDao {

    void save(Payment payment);

    int update(Payment payment);

    Payment get(int id);

    List<Payment> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
