package com.liuyanzhao.sens.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.liuyanzhao.sens.entity.Item;
import com.liuyanzhao.sens.entity.User;
import com.liuyanzhao.sens.service.ItemService;
import com.liuyanzhao.sens.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author 言曌
 * @date 2019-05-22 21:55
 */

@RestController
@RequestMapping("/course_api")
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 添加地址
     *
     * @return
     */
    @PostMapping("/release/create")
    public JsonResult create(@RequestParam("user_id") Long userId,
                             @RequestParam("name") String name,
                             @RequestParam("price") Integer price,
                             @RequestParam("img") String img) {

        Item item = new Item(name, img, price, userId);
        try {
            itemService.saveByItem(item);
            return new JsonResult(1, "操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }

    /**
     * 获得地址列表
     *
     * @return
     */
    @GetMapping("/wares/hot")
    public Object paging(
            @RequestParam(value = "currentPage", defaultValue = "0") Integer page,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer size) {

        Map<String,Object> map = new HashMap<>();
        map.put("copyright","本 API 接口只允许本人使用,其他机构或者个人使用均为侵权行为");
        try {
            Page pageable = new Page(page, size);
            Page<Item> pagingItems = itemService.pagingItems(pageable);
            map.put("totalCount",pagingItems.getTotal());
            map.put("currentPage",pagingItems.getCurrent());
            map.put("totalPage",pagingItems.getPages());
            map.put("pageSize",pagingItems.getSize());
            map.put("orders",pagingItems.getOrderByField());
            map.put("list",pagingItems.getRecords());
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }


}
