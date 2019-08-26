package com.hmy.create.factory.factory;

import com.hmy.create.factory.product.computer.Computer;
import com.hmy.create.factory.product.computer.Lenovo;

/**
 * @description:
 * 富士康 生产Lenovo
 */
public class FoxconnFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new Lenovo();
    }
}
