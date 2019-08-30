package com.hmy.construction.decorator;

/**
 * @description:
 *  Decorator： 实现了Foods，并聚合Foods
 *              但是Foods不知道Decorator的存在
 */
public abstract class Decorator implements Foods {

    private Foods foods;

    public Decorator(Foods foods) {
        this.foods = foods;
    }

    @Override
    public void print() {
        if (foods != null) {
            foods.print();
        }
    }
}
