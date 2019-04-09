package com.example.demo;

import com.example.demo.service.EmailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    EmailService emailService;
    @Test
    public void sendMailTest() {
        emailService.sendSimpleMail("243752773@qq.com", "test邮件","大家好");
    }

}
