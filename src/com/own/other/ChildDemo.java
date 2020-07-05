package com.own.other;

/**
 * @Author:lcl
 * @Date:2020/5/12
 * @Content:
 */
public class ChildDemo implements Cloneable{

    private String childName;

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return "ChildDemo{" +
                "childName='" + childName + '\'' +
                '}';
    }
}
