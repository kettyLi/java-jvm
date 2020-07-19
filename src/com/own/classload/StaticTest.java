package com.own.classload;

/**
 * @Author:lcl
 * @Date:2020/5/13
 * @Content:
 */
public class StaticTest {

    private static int i = 10;

    private String a;

    public StaticTest(){

    }

    public StaticTest(String a){
        this.a = a;
    }

    static {
        i = 5;
        //System.out.println("static block i="+i);
    }



    public String test(){
        System.out.println("test method");
        return "test method";
    }

    @Override
    public String toString() {
        return "StaticTest{" +
                "a='" + a + '\'' +
                '}';
    }

    public static void main(String[] args) {
       // System.out.println("i=" + i);
    }
}
