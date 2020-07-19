package com.own.designmode.decorator.coffee.coffee;

import com.own.designmode.decorator.coffee.Beverage;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content: 浓缩 coffee
 */
public class Espresso extends Beverage {

    public Espresso(){
        descripition = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 2;
    }
}
