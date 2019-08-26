package com.hmy.construction.bridge;

/**
 * @description:
 * 草地
 */
public class Grassland implements IBridge {
    @Override
    public void target() {
        System.out.println("通过桥，到达草地!");
    }
}
