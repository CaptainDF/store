package com.fire.store.dao;

import com.fire.store.domain.ItemDetail;
import com.fire.store.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by DZA on 2018/4/27.
 */
@Mapper
public interface ItemDetailDao {

    void save(ItemDetail itemDetail);

    int update(ItemDetail itemDetail);

    ItemDetail get(int id);

    List<ItemDetail> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
