package com.own.thread.threadlocal;

import com.own.thread.ThreadA;
import com.own.thread.ThreadB;

import java.text.SimpleDateFormat;

/**
 * @Author:lcl
 * @Date:2020/5/27
 * @Content:
 */
public class ThreadLocalTest {

    public static InhertableThreadLocalInitTest tl = new InhertableThreadLocalInitTest();
    public static ThreadLocalInitTest threadLocalInit = new ThreadLocalInitTest();
    public static ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<>();

    public static void testInherit(){

    }


    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();
        threadA.start();

        ThreadB threadB = new ThreadB();
        threadB.start();

      //  tl.set(System.currentTimeMillis());
        /*for (int i = 20; i < 25; i++){
            System.out.println("main thread get value:"+tl.get());
        }*/

    }
}
