package com.example.demo5.controller;


import com.example.demo5.model.User;
import com.example.demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
//  根据ID查询...
//    @PataVariable:用于获取url中的数据
@RequestMapping("/get")
@ResponseBody
private User get(String username){
    return userService.getUserById(username);
}
//    @GetMapping(value = "loginRequest/query/{id}")
//    public User getUserById(@PathVariable(value = "id") Integer id){
//
//        try {
//            User user = userService.getUserById(id);
//            return user;
//        }
//        catch (Exception e){
//
//            e.printStackTrace();
//        }
//
//        return null;
//    }

//   查询用户表
//    @RequestMapping(value = "loginRequests/query", method = RequestMethod.GET)
//    public List<User> getUserList(){
//
//        try {
//
//            List<User> users = userService.getUserList(lo);
//            return users;
//        }
//        catch (Exception e){
//
//            e.printStackTrace();
//        }
//
//        return null;
//    }

    //  添加用户
//    @RequestMapping(value = "loginRequest/add",method = RequestMethod.POST)
//    public ResponseEntity<JsonResult> add(@RequestBody User user){
//
//        JsonResult result = new JsonResult();
//
//        try {
//            int orderId = userService.add(user);
//            if ( orderId < 0){
//
//                result.setResult(orderId);
//                result.setStatus("failed");
//            }else {
//                result.setResult(orderId);
//                result.setStatus("ok");
//            }
//        }catch (Exception e){
//
//            result.setResult(e.getClass().getName()+":"+e.getMessage());
//            result.setStatus("error");
//            e.printStackTrace();
//        }
//
//        return ResponseEntity.ok(result);
//    }

//    删除用户
//    @RequestMapping(value = "loginRequest/delete/{id}",method = RequestMethod.DELETE)
//    public ResponseEntity<JsonResult> delete(@PathVariable(value = "id") Integer id){
//
//        JsonResult result = new JsonResult();
//        try {
//
//            int delId = userService.delete(id);
//            if ( delId < 0){
//
//                result.setResult(delId);
//                result.setStatus("failed");
//            }else {
//
//                result.setResult(delId);
//                result.setStatus("ok");
//            }
//        }catch (Exception e){
//
//            result.setResult(e.getClass().getName()+":"+e.getMessage());
//            result.setStatus("error");
//            e.printStackTrace();
//        }
//
//        return ResponseEntity.ok(result);
//    }

//   修改用户
//    @RequestMapping(value = "loginRequest/delete/{id}",method = RequestMethod.PUT)
//    public ResponseEntity<JsonResult> update(@PathVariable(value = "id") Integer id,
//                                             @RequestBody User user){
//
//        JsonResult result = new JsonResult();
//
//        try {
//
//            int ret = userService.update(id, user);
//            if ( ret < 0){
//
//                result.setResult(ret);
//                result.setStatus("failed");
//            }else {
//
//                result.setResult(ret);
//                result.setStatus("ok");
//            }
//        }catch (Exception e){
//
//            result.setResult(e.getClass().getName()+":"+e.getMessage());
//            result.setStatus("error");
//            e.printStackTrace();
//        }
//
//        return ResponseEntity.ok(result);
//    }
}



