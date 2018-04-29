package com.fire.store.service;

import com.fire.store.dao.ItemDetailDao;
import com.fire.store.domain.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemDetailServiceImpl implements ItemDetailService {

    @Autowired
    private ItemDetailDao itemDetailDao;

    @Override
    public void save(ItemDetail itemDetail) {
        itemDetailDao.save(itemDetail);
    }

    @Override
    public int update(ItemDetail itemDetail) {
        return itemDetailDao.update(itemDetail);
    }

    @Override
    public List getAllItems() {
        Map m = new HashMap<>();
        return itemDetailDao.list(m);
    }

    @Override
    public ItemDetail findItemById(int id) {
        return itemDetailDao.get(id);
    }
}
