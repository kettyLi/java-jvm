package com.own.designmode.decorator.coffee.test;

import com.own.designmode.decorator.coffee.Beverage;
import com.own.designmode.decorator.coffee.CondimentDecorator;
import com.own.designmode.decorator.coffee.coffee.HouseBlend;
import com.own.designmode.decorator.coffee.decorator.Milk;
import com.own.designmode.decorator.coffee.decorator.Moca;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content:
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Moca(houseBlend);
        houseBlend = new Milk(houseBlend);

        System.out.println("coffee=" + houseBlend.getDescripition() + "---cost=" + houseBlend.cost());

        new HashMap<>();
        new ConcurrentHashMap<>();

    }
}
