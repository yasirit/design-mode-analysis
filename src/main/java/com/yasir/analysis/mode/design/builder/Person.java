package com.yasir.analysis.mode.design.builder;

/**
 * @description: 建造者模式
 * @author: yasir
 * @date: 2022/4/4 14:40
 * @version: V1.0
 */
public class Person {

    private String name;

    private Integer age;

    private Integer gender;

    private Double height;

    private Double weight;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGender() {
        return gender;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public static class PersonBuilder {
        private String name;

        private Integer age;

        private Integer gender;

        private Double height;

        private Double weight;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder height(Double height) {
            this.height = height;
            return this;
        }

        public PersonBuilder weight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
