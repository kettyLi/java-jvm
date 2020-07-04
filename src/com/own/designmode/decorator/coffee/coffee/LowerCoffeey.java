package com.own.designmode.decorator.coffee.coffee;

import com.own.designmode.decorator.coffee.Beverage;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content:低咖啡因咖啡
 */
public class LowerCoffeey extends Beverage {

    public LowerCoffeey(){
        descripition = "低咖啡因咖啡";
    }

    @Override
    public double cost() {
        return 1;
    }
}
