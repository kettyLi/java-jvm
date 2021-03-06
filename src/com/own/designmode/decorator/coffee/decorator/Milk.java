package com.own.designmode.decorator.coffee.decorator;

import com.own.designmode.decorator.coffee.Beverage;
import com.own.designmode.decorator.coffee.CondimentDecorator;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content:
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescripition() {
        return beverage.getDescripition() + "调料是：milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.2;
    }
}
