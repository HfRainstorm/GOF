package com.hmy.create.factory.abstractFactory;

import com.hmy.create.factory.product.computer.Computer;
import com.hmy.create.factory.product.keyboard.KeyBoard;

public abstract class AbstractFactory {

    public abstract Computer getComputer();

    public abstract KeyBoard getKeyBoard();
}
