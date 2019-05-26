package com.liuyanzhao.sens.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.liuyanzhao.sens.entity.Item;
import com.liuyanzhao.sens.entity.User;
import com.liuyanzhao.sens.service.ItemService;
import com.liuyanzhao.sens.utils.FileUtils;
import com.liuyanzhao.sens.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
     * 添加商品
     *
     * @return
     */
    @PostMapping("/release/create")
    public JsonResult create(@RequestParam("user_id") Long userId,
                             @RequestParam("category_id") Long categoryId,
                             @RequestParam("campaign_id") Long campaignId,
                             @RequestParam("name") String name,
                             @RequestParam("price") Integer price,
                             @RequestParam(required = false, value = "img") MultipartFile file) throws IOException {
        String img = "";
        if (file != null) {
            img = FileUtils.upload(file.getInputStream());
        }
        Item item = new Item(name, img, price, userId, categoryId, campaignId);
        try {
            itemService.saveByItem(item);
            return new JsonResult(1, "操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }

    /**
     * 获得所有商品列表
     *
     * @return
     */
    @GetMapping("/wares/hot")
    public Object paging(
            @RequestParam(value = "currentPage", defaultValue = "0") Integer page,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer size) {

        Map<String, Object> map = new HashMap<>();
        map.put("copyright", "本 API 接口只允许本人使用,其他机构或者个人使用均为侵权行为");
        try {
            Page pageable = new Page(page, size);
            Page<Item> pagingItems = itemService.pagingItems(pageable);
            map.put("totalCount", pagingItems.getTotal());
            map.put("currentPage", pagingItems.getCurrent());
            map.put("totalPage", pagingItems.getPages());
            map.put("pageSize", pagingItems.getSize());
            map.put("orders", pagingItems.getOrderByField());
            map.put("list", pagingItems.getRecords());
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }

    /**
     * 根据分类Id获得商品分页
     *
     * @return
     */
    @GetMapping("/wares/list")
    public Object pagingByCategoryId(
            @RequestParam(value = "categoryId") Long categoryId,
            @RequestParam(value = "curPage", defaultValue = "0") Integer page,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer size) {

        Map<String, Object> map = new HashMap<>();
        map.put("copyright", "本 API 接口只允许本人使用,其他机构或者个人使用均为侵权行为");
        try {
            Page pageable = new Page(page, size);
            Page<Item> pagingItems = itemService.pagingByCategoryId(categoryId, pageable);
            map.put("totalCount", pagingItems.getTotal());
            map.put("currentPage", pagingItems.getCurrent());
            map.put("totalPage", pagingItems.getPages());
            map.put("pageSize", pagingItems.getSize());
            map.put("orders", pagingItems.getOrderByField());
            map.put("list", pagingItems.getRecords());
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }

    /**
     * 根据分类Id获得商品分页
     *
     * @return
     */
    @GetMapping("/wares/campaign/list")
    public Object pagingByCampaignId(
            @RequestParam(value = "campaignId") Long campaignId,
            @RequestParam(value = "orderBy",defaultValue = "0") Integer orderBy,
            @RequestParam(value = "curPage", defaultValue = "0") Integer page,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer size) {

        Map<String, Object> map = new HashMap<>();
        map.put("copyright", "本 API 接口只允许本人使用,其他机构或者个人使用均为侵权行为");
        try {
            Page pageable = new Page(page, size);
            if (orderBy == 1) {
                pageable = new Page(page, size, "sale", false);
            } else if (orderBy == 2) {
                pageable = new Page(page, size, "price", true);
            }
            Page<Item> pagingItems = itemService.pagingByCampaignId(campaignId, pageable);
            map.put("totalCount", pagingItems.getTotal());
            map.put("currentPage", pagingItems.getCurrent());
            map.put("totalPage", pagingItems.getPages());
            map.put("pageSize", pagingItems.getSize());
            map.put("orders", pagingItems.getOrderByField());
            map.put("list", pagingItems.getRecords());
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }
}
