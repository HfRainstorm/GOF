package com.hmy.construction.bridge;

/**
 * @description:
 * 抽象化角色（将其理解为桥接模式中抽象程度最高的类）
 */
public abstract class Animal {

    // 实现化角色的引用
    protected IBridge bridge;

    public abstract void wileGo();
}
