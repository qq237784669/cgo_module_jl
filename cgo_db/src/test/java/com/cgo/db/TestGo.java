package com.cgo.db;

import com.alibaba.fastjson.JSON;
import com.cgo.api.pojo.login_module.LoginRequest;
import com.cgo.api.service.web_module.user.IUserService;
import com.cgo.db.mapper.AaMapper;
import com.cgo.db.mapper.svc.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbStart.class})// 指定启动类
@Slf4j
public class TestGo {


    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AaMapper aaMapper;


    @Test
    public void test2(){
    }

    @Test
    public void test1(){

        LoginRequest loginRequest = JSON.parseObject("{\n" +
                "\t\"userId\":\"admin\",\n" +
                "    \"userType\":\"0\",\n" +
                "    \"password\":\"670B14728AD9902AECBA32E22FA4F6BD\",\n" +
                "    \"imei\":\"\",\n" +
                "    \"appVersionCode\":27,\n" +
                "    \"bdChannelId\":\"\",\n" +
                "\t\"bdTokenId\":\"\",\n" +
                "    \"platformType\":\"\",\n" +
                "\t\"mobileOs\":\"\"\n" +
                "}", LoginRequest.class);

        System.out.println(userService.login(loginRequest));

    }


}
