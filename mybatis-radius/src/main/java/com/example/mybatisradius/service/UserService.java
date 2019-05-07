package com.example.mybatisradius.service;

import com.example.mybatisradius.mybatis.mapper.UserMapper;
import com.example.mybatisradius.mybatis.po.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    @Qualifier("userMapper")
    UserMapper userMapper;
    // 增
    public Object add(User user){
        userMapper.insertSelective(user);
        return user;
    }
    // 删
    public Object del(Integer id){
        return userMapper.deleteByPrimaryKey(id);
    }
    // 改
    public Object update(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }
    // 查
    public Object find(Integer id){
        //查询该表的所有数据
        if (id == null) {
            return userMapper.selectByExample(null);
        } else {
            return userMapper.selectByPrimaryKey(id);
        }
    }
    // 分页
    public PageInfo findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.selectByExample(null);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}

