package com.liuyanzhao.sens.controller;

import com.liuyanzhao.sens.entity.Category;
import com.liuyanzhao.sens.service.CategoryService;
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
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 分类列表
     *
     * @return
     */
    @GetMapping("/category/list")
    public List<Category> list() {
        try {
            return categoryService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


}
