package com.example.demo5.controller;


import com.example.demo5.bean.JsonResult;
import com.example.demo5.bean.LoginRequest;
import com.example.demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

//  根据ID查询...
//    @PataVariable:用于获取url中的数据
    @GetMapping(value = "loginRequest/query/{id}")
    public LoginRequest getUserById(@PathVariable(value = "id") Integer id){

        try {
            LoginRequest loginRequest = userService.getUserById(id);
            return loginRequest;
        }
        catch (Exception e){

            e.printStackTrace();
        }

        return null;
    }

//   查询用户表
    @RequestMapping(value = "loginRequests/query", method = RequestMethod.GET)
    public List<LoginRequest> getUserList(){

        try {

            List<LoginRequest> loginRequests = userService.getUserList();
            return loginRequests;
        }
        catch (Exception e){

            e.printStackTrace();
        }

        return null;
    }

    //  添加用户
    @RequestMapping(value = "loginRequest/add",method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody LoginRequest loginRequest){

        JsonResult result = new JsonResult();

        try {
            int orderId = userService.add(loginRequest);
            if ( orderId < 0){

                result.setResult(orderId);
                result.setStatus("failed");
            }else {
                result.setResult(orderId);
                result.setStatus("ok");
            }
        }catch (Exception e){

            result.setResult(e.getClass().getName()+":"+e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }

        return ResponseEntity.ok(result);
    }

//    删除用户
    @RequestMapping(value = "loginRequest/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> delete(@PathVariable(value = "id") Integer id){

        JsonResult result = new JsonResult();
        try {

            int delId = userService.delete(id);
            if ( delId < 0){

                result.setResult(delId);
                result.setStatus("failed");
            }else {

                result.setResult(delId);
                result.setStatus("ok");
            }
        }catch (Exception e){

            result.setResult(e.getClass().getName()+":"+e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }

        return ResponseEntity.ok(result);
    }

//   修改用户
    @RequestMapping(value = "loginRequest/delete/{id}",method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(@PathVariable(value = "id") Integer id,
                                             @RequestBody LoginRequest loginRequest){

        JsonResult result = new JsonResult();

        try {

            int ret = userService.update(id,loginRequest);
            if ( ret < 0){

                result.setResult(ret);
                result.setStatus("failed");
            }else {

                result.setResult(ret);
                result.setStatus("ok");
            }
        }catch (Exception e){

            result.setResult(e.getClass().getName()+":"+e.getMessage());
            result.setStatus("error");
            e.printStackTrace();
        }

        return ResponseEntity.ok(result);
    }
}



