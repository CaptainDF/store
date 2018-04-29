package com.fire.store.service;

import com.fire.store.dao.CategoryDao;
import com.fire.store.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void save(Category category) {
        categoryDao.save(category);
    }

    @Override
    public int update(Category category) {
        return categoryDao.update(category);
    }

    @Override
    public List getAllCategory() {
        Map m = new HashMap<>();
        return categoryDao.list(m);
    }

    @Override
    public Category findCategoryById(int id) {
        return categoryDao.get(id);
    }
}
