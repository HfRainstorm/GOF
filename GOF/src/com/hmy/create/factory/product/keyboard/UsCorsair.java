package com.hmy.create.factory.product.keyboard;

public class UsCorsair implements KeyBoard {
    public UsCorsair() {
        System.out.println("初始化了海盗船键盘");
    }

    @Override
    public void getName() {
        System.out.println("海盗船也还行");
    }
}
