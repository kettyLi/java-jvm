package com.own.designmode.decorator.coffee;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content:CondimentDecorator extends Beverage is designed  to replace Beverage
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescripition();

}
