package com.yasir.analysis.mode.design.prototype;

import java.io.*;
import java.util.Objects;

/**
 * @description: 原型模式
 * @author: yasir
 * @date: 2022/4/4 16:32
 * @version: V1.0
 */
public class Student implements Serializable, Cloneable {
    private String name;

    private Integer age;

    private Integer gender;

    private Teacher teacher;

    public Student(String name, Integer age, Integer gender, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacher = teacher;
    }

    /**
     * 拷贝
     * @param cloneType
     * @return
     */
    public Student clone(CloneTypeEnum cloneType) throws CloneNotSupportedException {
        if(Objects.equals(CloneTypeEnum.EASY, cloneType)) {
            return (Student) super.clone();
        } else if(Objects.equals(CloneTypeEnum.DEEP, cloneType)) {
            Student student = null;
            try {
                student = (Student) super.clone();
                student.teacher = (Teacher) teacher.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return student;
        } else if(Objects.equals(CloneTypeEnum.SERIAL, cloneType)) {
            Student student = null;
            try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {
                oos.writeObject(this);
                try(ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis)){
                    student = (Student) ois.readObject();
                }

            } catch (Exception e){
                e.printStackTrace();
            }
            return student;
        } else {
            return null;
        }

//        Function<Student, Student> easyFunc = (s) -> {
//            try {
//                s.clone();
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//            return s;
//        };
//        Function<Student, Student> deepFunc = (s) -> {
//            try {
//                Student student = (Student) s.clone();
//                student.teacher = (Teacher) teacher.clone();
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//            return s;
//        };
//        Function<Student, Student> serialFunc = (s) -> {
//            Student student = null;
//            try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
//                ObjectOutputStream oos = new ObjectOutputStream(bos)) {
//                oos.writeObject(this);
//                try(ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
//                ObjectInputStream ois = new ObjectInputStream(bis)){
//                    student = (Student) ois.readObject();
//                }
//
//            } catch (Exception e){
//                e.printStackTrace();
//            }
//            return student;
//        };

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
