package com.own.other;

/**
 * @Author:lcl
 * @Date:2020/5/12
 * @Content:
 */
public class ParentDemo implements Cloneable{

    private String pName;

    private ChildDemo childDemo;

    @Override
    public String toString() {
        return "ParentDemo{" +
                "pName='" + pName + '\'' +
                ", childDemo=" + childDemo.toString() +
                '}';
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public ChildDemo getChildDemo() {
        return childDemo;
    }

    public void setChildDemo(ChildDemo childDemo) {
        this.childDemo = childDemo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ParentDemo parentDemo = new ParentDemo();
        ChildDemo childDemo = new ChildDemo();


        childDemo.setChildName("child name");
        parentDemo.setChildDemo(childDemo);
        parentDemo.setpName("parent name");

        ParentDemo clone = (ParentDemo)parentDemo.clone();
        clone.setpName("clone name");

        System.out.println("oriParent == cloneParent ? "+ (parentDemo.hashCode() == clone.hashCode()) +"");
        System.out.println("clone child =" + clone.getChildDemo());

        System.out.println("oriChild == cloneChild ? "+ (parentDemo.childDemo.hashCode() == clone.childDemo.hashCode()) +"");

        System.out.println("oriChildName : cloneChildName  :"+ childDemo.getChildName() + "---" +clone.getChildDemo().getChildName());

        System.out.println("begin to modify child name");
        clone.getChildDemo().setChildName("update name");
        System.out.println("oriChildName : cloneChildName  :"+ childDemo.getChildName() + "---" +clone.getChildDemo().getChildName());

    }


}
