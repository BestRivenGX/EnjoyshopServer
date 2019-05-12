package com.example.demo5.controller;


import com.alibaba.fastjson.JSONArray;
import com.example.demo5.service.CampaignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Campaign")
@RestController
@RequestMapping("/campaign")
public class CampaignController {

    private CampaignService campaignService;

    @Autowired
   public CampaignController (CampaignService campaignService){

       this.campaignService = campaignService;
   }

    @ApiOperation("Campaign")
    @GetMapping("/recommend")
    public JSONArray campaign(@RequestParam Integer type) {
        return campaignService.campaign(type);
    }

}
