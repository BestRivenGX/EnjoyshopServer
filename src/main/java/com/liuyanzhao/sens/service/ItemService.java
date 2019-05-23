package com.liuyanzhao.sens.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.liuyanzhao.sens.entity.Item;


/**
 * <pre>
 *     商品业务逻辑接口
 * </pre>
 *
 */
public interface ItemService {

    /**
     * 新增/修改商品
     *
     * @param item item
     * @return Role
     */
    void saveByItem(Item item);

    /**
     * 根据商品Id获得商品
     *
     * @param itemId 商品名
     * @return 商品
     */
    Item findByItemId(Long itemId);

    /**
     * 删除商品
     *
     * @param itemId 商品Id
     */
    void removeItem(Long itemId);

    /**
     * 根据活动Id分页获取所有商品
     *
     * @param campaignId 活动Id
     * @param page 分页信息
     * @return 商品列表
     */
    Page<Item> pagingByCampaignId(Long campaignId, Page<Item> page);

    Page<Item> pagingItems(Page<Item> page);

}
