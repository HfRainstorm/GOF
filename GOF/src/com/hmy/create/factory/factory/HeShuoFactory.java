package com.hmy.create.factory.factory;

import com.hmy.create.factory.product.computer.Computer;
import com.hmy.create.factory.product.computer.MacPro;

/**
 * @description:
 * 和硕 生产macPro
 */
public class HeShuoFactory implements Factory {
    @Override
    public Computer createComputer() {
        return new MacPro();
    }
}
