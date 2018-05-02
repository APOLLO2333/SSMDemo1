package com.song.ssm.controller;

import com.song.ssm.bean.UserBean;
import com.song.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by song2 on 2018/4/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<UserBean> getAll(){
        return userService.getAll();
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public List<UserBean> insertOne(UserBean userBean){
        userService.insertOne(userBean);
        return userService.getAll();
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public List<UserBean> deleteOne(int id){
        userService.deleteOne(id);
        return userService.getAll();
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public List<UserBean> updateOne(UserBean userBean){
        userService.updateOne(userBean);
        return userService.getAll();
    }
    @RequestMapping(value = "/one",method = RequestMethod.GET)
    @ResponseBody
    public UserBean selectOne(int id){
        return userService.selectOne(id);
    }
}
