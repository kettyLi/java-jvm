package com.own.thread;

import com.own.thread.threadlocal.ThreadLocalTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author:lcl
 * @Date:2020/5/27
 * @Content:
 */
public class ThreadB extends Thread{

    @Override
    public void run() {
        for (int i = 10; i < 15; i++){


            System.out.println("thread B get value:" + ThreadLocalTest.threadLocalInit.get().hashCode());
            new AtomicInteger();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}