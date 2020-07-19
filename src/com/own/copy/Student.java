package com.own.copy;

/**
 * @Author:lcl
 * @Date:2020/5/30
 * @Content:
 */
public class Student implements Cloneable{

    private String name;

    private int age;

    private Teacher teacher;

    @Override
    public Object clone() throws CloneNotSupportedException {
        this.teacher = (Teacher) teacher.clone();

        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
