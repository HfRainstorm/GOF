package com.hmy.create.factory.product.computer;

public class Lenovo implements Computer {
    public Lenovo() {
        System.out.println("初始化了Lenovo电脑");
    }

    @Override
    public void getName() {
        System.out.println("联想：只能联想，不敢真想");
    }
}
