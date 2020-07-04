package com.own.copy;

/**
 * @Author:lcl
 * @Date:2020/5/30
 * @Content:
 */
public class Teacher implements Cloneable{

    private String course;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course='" + course + '\'' +
                '}';
    }
}
