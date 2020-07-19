package com.own.thread.deadlock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author:lcl
 * @Date:2020/5/29
 * @Content:
 */
public class DeadLockDemo extends Thread{
    private String lockA;
    private String lockB;

    public DeadLockDemo(String name, String lockA, String lockB){
        super(name);
        this.lockA = lockA;
        this.lockB = lockB;
    }


    @Override
    public void run(){
        synchronized (lockA){
            System.out.println(this.getName() + " obtain lock:"+ lockA);
            try {
                Thread.sleep(2000);
                synchronized (lockB){
                    System.out.println(this.getName() + " obtain lock:" + lockB);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void testDeadLock() {
        String lockA = "lockA";
        String lockB = "lockB";

        DeadLockDemo thread1 = new DeadLockDemo("thread1", lockA, lockB);
        DeadLockDemo thread2 = new DeadLockDemo("thread2", lockB, lockA);

        thread1.start();
        thread2.start();


    }


    public static void main(String[] args) throws InterruptedException {
        ThreadMXBean mbean = ManagementFactory.getThreadMXBean();
        Runnable dlCheck = new Runnable() {

            @Override
            public void run() {
                long[] threadIds = mbean.findDeadlockedThreads();
                if (threadIds != null) {
                    ThreadInfo[] threadInfos = mbean.getThreadInfo(threadIds);
                    System.out.println("Detected deadlock threads:");
                    for (ThreadInfo threadInfo : threadInfos) {
                        System.out.println(threadInfo.getThreadName());
                    }
                }
            }
        };

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        // 稍等5秒，然后每10秒进行一次死锁扫描
        scheduler.scheduleAtFixedRate(dlCheck, 5L, 10L, TimeUnit.SECONDS);
        // 死锁样例代码…
        testDeadLock();
    }

}
