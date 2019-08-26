package com.hmy.create.factory.factory;

import com.hmy.create.factory.product.computer.Computer;

public class FactoryTest {
    public static void main(String[] args) {

        Factory foxconn = new FoxconnFactory();
        Computer lenovo = foxconn.createComputer();
        lenovo.getName();


        Factory heShuo = new HeShuoFactory();
        Computer macPro = heShuo.createComputer();
        macPro.getName();
    }
}
