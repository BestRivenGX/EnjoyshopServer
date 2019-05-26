package com.liuyanzhao.sens.service;

import com.liuyanzhao.sens.entity.Advert;

import java.util.List;


/**
 * <pre>
 *     菜单业务逻辑接口
 * </pre>
 *
 */
public interface AdvertService {

    /**
     * 新增/修改菜单
     *
     * @param advert advert
     * @return Role
     */
    void saveByAdvert(Advert advert);

    /**
     * 根据菜单Id获得菜单
     *
     * @param advertId 菜单名
     * @return 菜单
     */
    Advert findByAdvertId(Long advertId);
    
    /**
     * 删除菜单
     *
     * @param advertId 菜单Id
     */
    void removeAdvert(Long advertId);

    /**
     * 根据用户ID获得菜单
     *
     * @param userId 用户ID
     * @return
     */
    List<Advert> findByUserId(Long userId);

    /**
     * 获得所有菜单
     */
    List<Advert> findAll();

    /**
     * 根据类型获得所有菜单
     */
    List<Advert> findByType(Integer type);
}
