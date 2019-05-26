package com.liuyanzhao.sens.service.impl;

import com.liuyanzhao.sens.entity.Category;
import com.liuyanzhao.sens.mapper.CategoryMapper;
import com.liuyanzhao.sens.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void saveByCategory(Category category) {
        //2.修改
        if (category != null && category.getId() != null) {
            categoryMapper.updateById(category);
        } else {
            categoryMapper.insert(category);
        }
    }



    @Override
    public Category findByCategoryId(Long categoryId) {
        return categoryMapper.selectById(categoryId);
    }

    @Override
    public void removeCategory(Long categoryId) {
        categoryMapper.deleteById(categoryId);
    }

    @Override
    public List<Category> findByUserId(Long userId) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("user_id",userId);
        return categoryMapper.selectByMap(map);
    }

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }
}
