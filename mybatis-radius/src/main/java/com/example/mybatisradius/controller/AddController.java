package com.example.mybatisradius.controller;


import com.example.mybatisradius.mybatis.mapper.UserMapper;
import com.example.mybatisradius.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    //替换成自己生成的mapper
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(@RequestBody User user){
        //查询该表的所有数据
        userMapper.insertSelective(user);
        return user;
    }
}
