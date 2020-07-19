package com.own.thread.countdowncyclic;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.*;

/**
 * @Author:lcl
 * @Date:2020/5/31
 * @Content:
 */
public class CountDownLatchDemo {

    public static void methodA(){
        System.out.println("this is method A");
    }

    public static  void methodB(){
        System.out.println("this is method B");
    }

    public static void methodC(){
        System.out.println("this is method C");
    }

    /**
     * 测试方法C 等待方法A/B执行完
     */
    public static void testCountDownLatch(){
        Executor executor = Executors.newFixedThreadPool(2);

        CountDownLatch latch = new CountDownLatch(2);

        //执行方法A
        executor.execute(() -> {
            methodA();
            latch.countDown();
        });

        //执行方法B
        executor.execute(() -> {
            methodB();
            latch.countDown();
        });

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        methodC();
    }

    public static void testCyclicBarrier(){
       Executor executor = Executors.newFixedThreadPool(1);

       //线程1、线程2调用await()计数器减为0后，会执行回调方法，即构造函数的第二个参数的方法
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> executor.execute(() -> methodC()));


        Thread t1 = new Thread(() ->{
                methodA();
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        t1.start();

        Thread t2 = new Thread(() ->{
            methodB();
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        t2.start();
    }

    public static void main(String[] args) {
        testCyclicBarrier();
    }

}
