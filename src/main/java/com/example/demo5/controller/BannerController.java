package com.example.demo5.controller;

import com.example.demo5.service.BannerService;

import com.example.demo5.vo.BannerVO;
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
    public BannerVO banner(@RequestParam Integer type) {
        return bannerService.banner(type);
    }
}
