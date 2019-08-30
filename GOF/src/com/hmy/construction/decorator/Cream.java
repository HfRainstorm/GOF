package com.hmy.construction.decorator;

/**
 * @description:
 *  相当于Decorator： 装饰品1号
 */
public class Cream extends Decorator {

    public Cream(Foods foods) {
        super(foods);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("加入奶油！");
    }
}
