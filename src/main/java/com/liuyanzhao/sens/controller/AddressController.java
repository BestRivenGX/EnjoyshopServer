package com.liuyanzhao.sens.controller;

import com.google.common.base.Strings;
import com.liuyanzhao.sens.entity.Address;
import com.liuyanzhao.sens.entity.User;
import com.liuyanzhao.sens.service.AddressService;
import com.liuyanzhao.sens.service.UserService;
import com.liuyanzhao.sens.utils.JsonResult;
import com.liuyanzhao.sens.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
     * 更新地址
     *
     * @return
     */
    @PostMapping("/update")
    public JsonResult update(@RequestParam("id") Long id,
                             @RequestParam(value = "consignee", required = false) String consignee,
                             @RequestParam(value = "phone", required = false) String phone,
                             @RequestParam(value = "addr", required = false) String addr,
                             @RequestParam(value = "zip_code", required = false) String zipCode,
                             @RequestParam(value = "is_default", required = false) Integer isDefault) {


        try {
            Address address = addressService.findByAddressId(id);
            if (address == null) {
                return new JsonResult(0, "地址不存在！");
            }
            //如果设置该地址为默认地址，去掉其他默认地址
            if (isDefault == 1) {
                addressService.resetDefaultAddress(address.getUserId());
            }
            if (!Strings.isNullOrEmpty(consignee)) {
                address.setConsignee(consignee);
            }
            if (!Strings.isNullOrEmpty(phone)) {
                address.setPhone(phone);
            }
            if (!Strings.isNullOrEmpty(addr)) {
                address.setAddr(addr);
            }
            if (!Strings.isNullOrEmpty(zipCode)) {
                address.setZipCode(zipCode);
            }
            if (isDefault != null && isDefault == 1) {
                address.setIsDefault(isDefault);
            } else {
                address.setIsDefault(0);
            }
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
    public List<Address> listAddrByUserId(@RequestParam("user_id") Long userId) {

        try {
            return addressService.findByUserId(userId);
        } catch (Exception e) {
            e.printStackTrace();
           return new ArrayList<>();
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
