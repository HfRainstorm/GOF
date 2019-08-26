package com.hmy.create.factory.product.computer;

public class MacPro implements Computer {
    public MacPro() {
        System.out.println("初始化了MacPro电脑");
    }

    @Override
    public void getName() {
        System.out.println("Mac: 用用air就行了，用什么pro");
    }
}
