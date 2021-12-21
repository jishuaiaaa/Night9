package com.services.Impl;

import com.bean.User;
import com.dao.TestMapper;
import com.services.TestService;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public ArrayList<User> queryUserList() {
        return testMapper.queryUserList();
    }
}
