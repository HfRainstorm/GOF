package com.hmy.create.factory.abstractFactory;

import com.hmy.create.factory.product.computer.Computer;
import com.hmy.create.factory.product.computer.MacPro;
import com.hmy.create.factory.product.keyboard.Cherry;
import com.hmy.create.factory.product.keyboard.KeyBoard;

/**
 * @description:
 * 给MacPro 装配 cherry键盘
 */
public class MacProPartsFactory extends AbstractFactory {
    @Override
    public Computer getComputer() {
        return new MacPro();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new Cherry();
    }
}
