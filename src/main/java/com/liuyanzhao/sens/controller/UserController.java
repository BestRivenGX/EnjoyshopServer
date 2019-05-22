package com.liuyanzhao.sens.controller;

import com.liuyanzhao.sens.entity.User;
import com.liuyanzhao.sens.service.UserService;
import com.liuyanzhao.sens.utils.JsonResult;
import com.liuyanzhao.sens.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


/**
 * @author 言曌
 * @date 2019-05-22 21:55
 */

@RestController
@RequestMapping("/course_api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     *
     * @param phone    手机号
     * @param password 密码
     * @return
     */
    @PostMapping("/reg")
    public JsonResult register(@RequestParam("phone") String phone,
                               @RequestParam("password") String password) {

        User result = new User();
        String token = Md5Util.strToMd5(phone);
        try {
            User user = userService.findByPhone(phone);
            if (user == null) {
                result.setLogoUrl("http://pruvywgjy.bkt.clouddn.com/1.jpeg");
                result.setMobi(phone);
                result.setPassword(password);
                result.setToken(token);
                result.setUsername("新用户" + phone);
                userService.saveByUser(result);
            } else {
                return new JsonResult(0, "手机号已存在！");
            }

        } catch (Exception e) {
            return new JsonResult(0, "操作失败！");
        }
        return new JsonResult(1, "注册成功！", token, result);
    }

    /**
     * 注册
     *
     * @param phone    手机号
     * @param password 密码
     * @return
     */
    @PostMapping("/login")
    public JsonResult login(@RequestParam("phone") String phone,
                            @RequestParam("password") String password) {

        try {
            User user = userService.findByPhone(phone);
            if (user == null) {
                return new JsonResult(0, "手机号不存在！");
            }

            if (!Objects.equals(user.getPassword(), password)) {
                return new JsonResult(0, "密码不正确！");
            }
            String token = Md5Util.strToMd5(phone);
            return new JsonResult(1, "登录成功！", token, user);

        } catch (Exception e) {
            return new JsonResult(0, "操作失败！");
        }
    }
}
