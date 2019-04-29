package com.example.mybatis.controller;

import com.example.mybatis.mybatis.mapper.UserMapper;
import com.example.mybatis.mybatis.po.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    //替换成自己生成的mapper
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(User user){
        //查询该表的所有数据
        System.out.print(user);
        userMapper.insertSelective(user);
        return user;
    }
}
