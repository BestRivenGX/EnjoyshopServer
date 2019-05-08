package com.example.demo5.controller;

import com.example.demo5.request.UserRequest;
import com.example.demo5.service.UserService;
import com.example.demo5.vo.LoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "User")
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation("Login")
    @PostMapping("/login")
    public LoginVO login(@RequestBody UserRequest userRequest) {
        return userService.login(userRequest);
    }
}



