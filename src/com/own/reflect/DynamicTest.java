package com.own.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:lcl
 * @Date:2020/5/25
 * @Content:
 */
public class DynamicTest {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(hello);
       Hello proxyHello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(),HelloImpl.class.getInterfaces(),
               myInvocationHandler);
       proxyHello.personSay();
       proxyHello.sayHello();

    }

    static class MyInvocationHandler implements InvocationHandler{

        private Object target;

        public MyInvocationHandler(Object target){
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoke MyInvocationHandler");
            Object invoke = method.invoke(target);
            return invoke;
        }
    }

    interface Hello {
        void personSay();
        void sayHello();


    }
     static class HelloImpl implements  Hello {

         @Override
         public void personSay() {
             System.out.println("Mary");
         }

         @Override
        public void sayHello() {
            System.out.println("Hello World");
        }
    }


}
