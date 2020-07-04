package com.own.thread;

import com.own.thread.threadlocal.ThreadLocalTest;

/**
 * @Author:lcl
 * @Date:2020/5/27
 * @Content:
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
           /*
            if (ThreadLocalTest.tl.get() == null){
                ThreadLocalTest.tl.set(new Date());
            }
*/
            System.out.println("thread A get value:" + ThreadLocalTest.threadLocalInit.get().hashCode());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}