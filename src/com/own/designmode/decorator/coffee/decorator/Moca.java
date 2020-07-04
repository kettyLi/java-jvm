package com.own.designmode.decorator.coffee.decorator;

import com.own.designmode.decorator.coffee.Beverage;
import com.own.designmode.decorator.coffee.CondimentDecorator;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content:decorator
 */
public class Moca  extends CondimentDecorator {

    private Beverage beverage;

    public Moca(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescripition() {
        return beverage.getDescripition() + "，调料是：moca";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.1;
    }
}
