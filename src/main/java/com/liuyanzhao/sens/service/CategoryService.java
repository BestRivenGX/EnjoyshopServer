package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.Category;

import java.util.List;


/**
 * <pre>
 *     菜单业务逻辑接口
 * </pre>
 *
 */
public interface CategoryService {

    /**
     * 新增/修改菜单
     *
     * @param category category
     * @return Role
     */
    void saveByCategory(Category category);

    /**
     * 根据菜单Id获得菜单
     *
     * @param categoryId 菜单名
     * @return 菜单
     */
    Category findByCategoryId(Long categoryId);
    
    /**
     * 删除菜单
     *
     * @param categoryId 菜单Id
     */
    void removeCategory(Long categoryId);


    /**
     * 根据用户ID获得菜单
     *
     * @param userId 用户ID
     * @return
     */
    List<Category> findByUserId(Long userId);

    /**
     * 获得所有菜单
     */
    List<Category> findAll();
}
