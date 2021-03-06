package com.fire.store.service;

import com.fire.store.domain.Category;
import com.fire.store.domain.User;

import java.util.List;

/**
 * Created by DZA on 2018/4/27.
 */
public interface CategoryService {

    void save(Category category);

    int update(Category category);

    List getAllCategory();

    Category findCategoryById(int id);
}
