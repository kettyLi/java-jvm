package com.own.designmode.decorator.coffee;

/**
 * @Author:lcl
 * @Date:2020/5/26
 * @Content:
 */
public abstract class Beverage {

    public String descripition;

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    public abstract double cost();
}
