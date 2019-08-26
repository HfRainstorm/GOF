package com.hmy.create.factory.simpleFacotry;

import com.hmy.create.factory.product.computer.Computer;
import com.hmy.create.factory.product.computer.Lenovo;
import com.hmy.create.factory.product.computer.MacPro;

public class SimpleFactory {

    public static Computer createComputer(String model) {

        switch (model) {
            case "Lenovo":
                return new Lenovo();
            case "MacPro":
                return new MacPro();
            default:
                break;
        }
        return null;
    }
}
