package com.own.designmode.decorator.coffee.coffee;

import com.own.designmode.decorator.coffee.Beverage;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content: 综合coffee
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        descripition = "综合咖啡";
    }

    @Override
    public double cost() {
        return 3;
    }
}
