package com.liuyanzhao.sens.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.liuyanzhao.sens.entity.Item;
import com.liuyanzhao.sens.mapper.ItemMapper;
import com.liuyanzhao.sens.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 言曌
 * @date 2019-05-22 21:21
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public void saveByItem(Item item) {
        if (item != null && item.getId() != null) {
            itemMapper.updateById(item);
        } else {
            itemMapper.insert(item);
        }
    }


    @Override
    public Item findByItemId(Long itemId) {
        return itemMapper.selectById(itemId);
    }

    @Override
    public void removeItem(Long itemId) {
        itemMapper.deleteById(itemId);
    }

    @Override
    public Page<Item> pagingByActivityId(Long activityId, Page<Item> page) {
        return page.setRecords(itemMapper.findByActivityId(activityId, page));
    }
}
