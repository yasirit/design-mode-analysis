package com.yasir.analysis.mode.design.builder;

/**
 * @description:
 * @author: yasir
 * @date: 2022/4/4 14:47
 * @version: V1.0
 */
public class BuilderTest {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder().name("沈益鑫").age(28).gender(1).height(173d).weight(70d).build();
        System.out.println(p.toString());
    }
}
