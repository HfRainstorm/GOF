package com.hmy.create.factory.abstractFactory;

import com.hmy.create.factory.product.keyboard.KeyBoard;
import com.hmy.create.factory.product.keyboard.UsCorsair;

/**
 * @description:
 * keyboard  2号生产商
 */
public class KeyBoardFactory2 implements KeyBoardFactory {
    @Override
    public KeyBoard createKeyBoard() {
        return new UsCorsair();
    }
}
