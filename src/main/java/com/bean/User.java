package com.bean;

import org.springframework.context.annotation.Bean;

public class User {
    private Integer id;
    /*
    * 1： 男
    * 0： 女
    * */
    private Integer sex;
    private Integer age;
    private String avatar;
    private String username;
    private String password;


    public User() {}

    public Integer getId() {
        return id;
    }

    public Integer getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sex=" + sex +
                ", age=" + age +
                ", avatar='" + avatar + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
