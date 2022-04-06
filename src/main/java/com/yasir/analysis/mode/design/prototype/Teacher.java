package com.yasir.analysis.mode.design.prototype;

import java.io.Serializable;

/**
 * @description: 原型模式
 * @author: yasir
 * @date: 2022/4/4 16:32
 * @version: V1.0
 */
public class Teacher implements Serializable, Cloneable {
    private String name;

    private Integer age;

    private Integer gender;

    public Teacher(String name, Integer age, Integer gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
