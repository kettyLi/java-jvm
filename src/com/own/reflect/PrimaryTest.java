package com.own.reflect;

import com.own.classload.StaticTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author:lcl
 * @Date:2020/5/25
 * @Content:
 */
public class PrimaryTest {

    public static void testClass(){
        try {
            Class<?> aClass = Class.forName("com.own.classload.StaticTest");
            StaticTest staticTest = (StaticTest)aClass.newInstance();


            Field i = aClass.getDeclaredField("a");
            i.setAccessible(true);

            i.set(staticTest,"aValue");
            String val = (String) i.get(staticTest);
            System.out.println("s=" +val);

            Method test = aClass.getDeclaredMethod("test");
            String invoke = (String) test.invoke(staticTest);
            System.out.println("method return value="+invoke);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws NoSuchFieldException {
        testClass();
    }

}
