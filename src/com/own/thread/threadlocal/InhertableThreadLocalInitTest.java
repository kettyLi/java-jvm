package com.own.thread.threadlocal;

/**
 * @Author:lcl
 * @Date:2020/5/27
 * @Content:
 */
public class InhertableThreadLocalInitTest extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return System.currentTimeMillis() + "---inhert";
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "i am child value";
    }

}
