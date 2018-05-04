package com.soa.mfc.controller;

import com.soa.mfc.pojo.User;
import com.soa.mfc.service.UserService;
import com.soa.mfc.common.pojo.MfcResult;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yunxin on 2018/5/3.
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/user/save")
    @ResponseBody
    public MfcResult addItem(User user, String desc) {
        MfcResult result = userService.addUser(user);
        System.out.println("ert");
        return result;
    }
}
