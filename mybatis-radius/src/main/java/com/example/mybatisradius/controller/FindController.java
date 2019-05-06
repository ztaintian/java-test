package com.example.mybatisradius.controller;

import com.example.mybatisradius.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindController {
    //替换成自己生成的mapper
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @RequestMapping("/find")
    public Object find(@RequestParam("id") Integer id){
        //查询该表的所有数据
        if (id == null) {
            return userMapper.selectByExample(null); 
        } else {
            return userMapper.selectByPrimaryKey(id);
        }
    }
}
