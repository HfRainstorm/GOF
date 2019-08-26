package com.hmy.create.factory.abstractFactory;


import com.hmy.create.factory.product.computer.Computer;
import com.hmy.create.factory.product.computer.Lenovo;
import com.hmy.create.factory.product.keyboard.KeyBoard;
import com.hmy.create.factory.product.keyboard.UsCorsair;

/**
 * @description:
 * 给Lenovo 装配 海盗船键盘
 */
public class LenovoPartsFacotry extends AbstractFactory{

    @Override
    public Computer getComputer() {
        return new Lenovo();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new UsCorsair();
    }
}
