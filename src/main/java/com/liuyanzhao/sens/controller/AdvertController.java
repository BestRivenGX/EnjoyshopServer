package com.liuyanzhao.sens.controller;

import com.liuyanzhao.sens.entity.Advert;
import com.liuyanzhao.sens.service.AdvertService;
import com.liuyanzhao.sens.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author 言曌
 * @date 2019-05-22 21:55
 */

@RestController
@RequestMapping("/course_api")
public class AdvertController {

    @Autowired
    private AdvertService advertService;

    /**
     * 广告列表
     *
     * @return
     */
    @GetMapping("/banner/query")
    public List<Advert> list(@RequestParam(value = "type", defaultValue = "1") Integer type) {
        try {
            return advertService.findByType(type);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


}
