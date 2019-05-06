package com.example.mybatisradius.controller;

import com.example.mybatisradius.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelController {
    //替换成自己生成的mapper
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @RequestMapping("/del")
    public Object del(@RequestParam("id") Integer id){
        return userMapper.deleteByPrimaryKey(id);
    }
}
