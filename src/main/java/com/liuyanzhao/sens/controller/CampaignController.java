package com.liuyanzhao.sens.controller;

import com.liuyanzhao.sens.entity.Campaign;
import com.liuyanzhao.sens.service.CampaignService;
import com.liuyanzhao.sens.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author 言曌
 * @date 2019-05-22 21:55
 */

@RestController
@RequestMapping("/course_api")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    /**
     * 活动列表
     *
     * @return
     */
    @GetMapping("/campaign/recommend")
    public JsonResult list() {
        try {
            List<Campaign> campaignList = campaignService.findAll();
            return new JsonResult(1, "操作成功！", campaignList);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }


}
