package com.controller;

import com.bean.User;
import com.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ArrayList<User> queryUserList(){
        return testService.queryUserList();
    }

    @RequestMapping(value = "/addMessage", method = RequestMethod.GET)
    public String addMessage(){
        int i = 1;
        return "message added successfully";
    }

    @RequestMapping(value = "/inquireMessage", method = RequestMethod.GET)
    public String inquireMessage(){
        if (true){
            return "this is good message ";
        }
        return "message added enquireMessage";
    }


}
