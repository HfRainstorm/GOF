package com.hmy.create.factory.simpleFacotry;

import com.hmy.create.factory.product.computer.Computer;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Computer computer = SimpleFactory.createComputer("Lenovo");

        assert computer != null; // 可能为空，做个非空判断
        computer.getName();
    }
}
