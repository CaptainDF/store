package com.fire.store.dao;

import com.fire.store.domain.Category;
import com.fire.store.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by DZA on 2018/4/27.
 */
@Mapper
public interface CategoryDao {

    void save(Category category);

    int update(Category category);

    User get(int id);

    List<Category> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
