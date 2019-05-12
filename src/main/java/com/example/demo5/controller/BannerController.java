package com.example.demo5.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.demo5.service.BannerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
