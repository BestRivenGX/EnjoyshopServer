package com.liuyanzhao.sens.controller;

import com.liuyanzhao.sens.entity.Address;
import com.liuyanzhao.sens.entity.User;
import com.liuyanzhao.sens.service.AddressService;
import com.liuyanzhao.sens.service.UserService;
import com.liuyanzhao.sens.utils.JsonResult;
import com.liuyanzhao.sens.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


/**
 * @author 言曌
 * @date 2019-05-22 21:55
 */

@RestController
@RequestMapping("/course_api/addr")
public class AddressController {

    @Autowired
    private AddressService addressService;

    /**
     * 添加地址
     *
     * @return
     */
    @PostMapping("/create")
    public JsonResult create(@RequestParam("user_id") Long userId,
                             @RequestParam("consignee") String consignee,
                             @RequestParam("phone") String phone,
                             @RequestParam("addr") String addr,
                             @RequestParam("zip_code") String zipCode) {

        Address address = new Address(userId, consignee, phone, addr, zipCode);

        try {
            addressService.saveByAddress(address);
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
    @GetMapping("/list")
    public JsonResult listAddrByUserId(@RequestParam("user_id") Long userId) {

        try {
            List<Address> addressList = addressService.findByUserId(userId);
            return new JsonResult(1, "操作成功！", addressList);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }

    /**
     * 删除地址
     *
     * @return
     */
    @GetMapping("/del")
    public JsonResult delete(@RequestParam("id") Long id) {
        try {
            addressService.removeAddress(id);
            return new JsonResult(1, "操作成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(0, "操作失败！");
        }
    }

}
