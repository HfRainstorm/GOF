package com.hmy.construction.decorator;

/**
 * @description:
 *  相当于Decorator： 装饰品2号
 */
public class Fruit extends Decorator {

    public Fruit(Foods foods) {
        super(foods);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("加入水果！");
    }

}
