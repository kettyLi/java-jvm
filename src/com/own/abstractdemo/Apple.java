package com.own.abstractdemo;

import java.math.BigDecimal;

/**
 * @Author:lcl
 * @Date:2020/6/4
 * @Content:
 */
public class Apple extends Fruit {
    @Override
    public BigDecimal getPrice() {
        return null;
    }

    public static void main(String[] args) {
        int i;
        try {
            i =10;
        }catch (Exception e){
            throw new NullPointerException();
        }finally {
            i = 20;
        }

        System.out.println("i="+i);
    }
}
