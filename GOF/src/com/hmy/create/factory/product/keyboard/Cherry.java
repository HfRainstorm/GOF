package com.hmy.create.factory.product.keyboard;

public class Cherry implements KeyBoard {

    public Cherry() {
        System.out.println("初始化了Cherry");
    }

    @Override
    public void getName() {
        System.out.println("Cherry天下第一");
    }
}
