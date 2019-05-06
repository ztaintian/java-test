package com.example.mybatisradius.controller;

import com.example.mybatisradius.mybatis.mapper.UserMapper;
import com.example.mybatisradius.mybatis.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class UpdateController {
    //替换成自己生成的mapper
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
