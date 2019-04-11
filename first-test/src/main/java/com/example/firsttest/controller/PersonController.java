package com.example.firsttest.controller;

import com.example.firsttest.modules.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {
    @RequestMapping("getPerson")
    public Map<String,Object> getPerson(@RequestBody Person person){
        Map<String,Object> param = new HashMap<>();
//        String s = person.getPhones().toString();
//        System.out.println(s);
        param.put("person",person);
        return param;
    }
}
