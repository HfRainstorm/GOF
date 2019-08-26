package com.hmy.create.factory.abstractFactory;

import com.hmy.create.factory.product.keyboard.Cherry;
import com.hmy.create.factory.product.keyboard.KeyBoard;

/**
 * @description:
 * keyboard  1号生产商
 */
public class KeyBoardFactory1 implements KeyBoardFactory {
    @Override
    public KeyBoard createKeyBoard() {
        return new Cherry();
    }
}
