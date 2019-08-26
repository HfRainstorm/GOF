package com.hmy.construction.bridge;

public class BridgeTest {

    public static void main(String[] args) {

        Animal horse = new Horse();

        horse.wileGo();

        // 通过桥接模式调用，如果不赋初值，会报空指针异常
        horse.bridge = new Grassland();
        horse.bridge.target();

        System.out.println("----两个方法也可以各自独立使用，互不干扰----");
        Animal horse2 = new Horse();
        horse2.wileGo();

        Grassland grassland = new Grassland();
        grassland.target();
    }
}
