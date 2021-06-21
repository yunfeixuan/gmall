package com.atguigu.gmall.gmallusermanage.controller;

import com.atguigu.gmall.gmallusermanage.Service.UserService;
import com.atguigu.gmall.gmallusermanage.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public String addUser(UserInfo userInfo){
        userService.addUser(userInfo);
        return "success";

    }

    @GetMapping("allUser")
    public List<UserInfo> getAllUser(){
        return userService.getUserInfoListAll();
    }

    @GetMapping("userInfo")
    public UserInfo getUser(String id){
        return userService.getUserInfo(id);
    }

    @PostMapping("delUser")
    public String deleteUser(String id){

        userService.delUser(id);
        return "success";
    }

    @PostMapping("updateUser")
    public String updateUser(UserInfo userInfo){
        userService.updateUserByName(userInfo.getName(),userInfo);
        return "success";
    }

}
