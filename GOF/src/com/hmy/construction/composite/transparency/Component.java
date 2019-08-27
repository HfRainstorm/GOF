package com.hmy.construction.composite.transparency;

public abstract class Component {

    public abstract int totalPrice();

    public abstract void add(Component component);

    public abstract void remove(Component component);
}
