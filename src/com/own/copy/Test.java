package com.own.copy;

/**
 * @Author:lcl
 * @Date:2020/5/30
 * @Content:
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        Teacher teacher = new Teacher();
        teacher.setCourse("english");
        student.setAge(10);
        student.setName("mary");
        student.setTeacher(teacher);

        System.out.println("clone before, student hashcode="+student.hashCode() +
                "---teacher hashcode=" + teacher.hashCode());

        Student stuClone = (Student) student.clone();
        Teacher teacher1 = stuClone.getTeacher();


        System.out.println("clone after, student hashcode="+stuClone.hashCode() +
                "---teacher hashcode=" + teacher1.hashCode());

    }
}
