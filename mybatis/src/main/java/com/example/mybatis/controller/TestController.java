package com.example.mybatis.controller;

import com.example.mybatis.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //替换成自己生成的mapper
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        //查询该表的所有数据
        return userMapper.selectByExample(null);
    }
}
