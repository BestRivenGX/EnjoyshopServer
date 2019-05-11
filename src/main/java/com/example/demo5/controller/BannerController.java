package com.example.demo5.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo5.dao.BannerDynamicSqlSupport;
import com.example.demo5.model.Banner;
import com.example.demo5.service.BannerService;

import com.example.demo5.vo.BannerList;
import com.example.demo5.vo.BannerVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@Api(tags = "Banner")
@RestController
@RequestMapping("/banner")
public class BannerController {

    private BannerService bannerService;


    @Autowired
    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @ApiOperation("Banner")
    @GetMapping("/banner")
    public JSONArray banner(@RequestParam Integer type) {
        return bannerService.banner(type);
    }

}
