package com.fire.store.service;

import com.fire.store.domain.ItemDetail;
import com.fire.store.domain.User;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
public interface ItemDetailService {

    void save(ItemDetail itemDetail);

    int update(ItemDetail itemDetail);

    List getAllItems();

    ItemDetail findItemById(int id);
}
