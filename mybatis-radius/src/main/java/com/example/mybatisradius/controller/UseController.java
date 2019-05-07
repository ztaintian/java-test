package com.example.mybatisradius.controller;


import com.example.mybatisradius.mybatis.po.User;
import com.example.mybatisradius.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UseController {
    @Autowired
    UserService userService;

     // 分页
    @GetMapping("findAll")
    public PageInfo getUser(int pageNum, int pageSize) {
        return userService.findAll(pageNum,pageSize);
    }
    // 增
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Object add(@RequestBody User user){
        return userService.add(user);
    }
    // 删
    @GetMapping("del")
    public Object del(@RequestParam("id") Integer id){
        return userService.del(id);
    }
    // 改
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(@RequestBody User user){
        return userService.update(user);
    }
    // 查
    @RequestMapping("/find")
    public Object find(@RequestParam("id") Integer id){
        //查询该表的所有数据
        return userService.find(id);
    }
}
