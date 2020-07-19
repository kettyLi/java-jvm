package com.own.thread.synchro;

/**
 * @Author:lcl
 * @Date:2020/5/31
 * @Content:
 */
public class SynchronizedTest {
   private static String a = "test";

    public static synchronized void test1(){

    }

    public  synchronized void test3(){

    }

    public static void test2(){
        synchronized (a){

        }
    }

    public static void main(String[] args) {

    }
}
