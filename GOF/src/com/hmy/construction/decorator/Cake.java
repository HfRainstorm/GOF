package com.hmy.construction.decorator;

/**
 * @description:
 *  相当于ConcreteComponent： 被装饰的东西
 */
public class Cake implements Foods {
    @Override
    public void print() {
        System.out.println("制造蛋糕！");
    }
}
