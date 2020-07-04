package com.own.thread.threadlocal;

import java.text.SimpleDateFormat;

/**
 * @Author:lcl
 * @Date:2020/5/27
 * @Content:
 */
public class ThreadLocalInitTest extends ThreadLocal {


    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }


}
