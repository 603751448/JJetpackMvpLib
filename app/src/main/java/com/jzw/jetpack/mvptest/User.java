package com.jzw.jetpack.mvptest;


import java.io.Serializable;

/**
 * @anthor created by jzw
 * @date 2019/12/20
 * @change
 * @describe user 表
 **/
public class User implements Serializable {

    private String name;
    private String age;
    private String city;
    public User(String name,String age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
