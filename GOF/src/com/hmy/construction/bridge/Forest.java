package com.hmy.construction.bridge;

/**
 * @description:
 * 森林
 */
public class Forest implements IBridge {
    @Override
    public void target() {
        System.out.println("通过桥，到达森林!");
    }
}
