package com.dao;

import com.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TestMapper {
    // 查询所有用户
    ArrayList<User> queryUserList();
}
