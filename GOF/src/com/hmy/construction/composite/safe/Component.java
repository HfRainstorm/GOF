package com.hmy.construction.composite.safe;

public abstract class Component {

    public abstract int totalPrice();

    public void add(Component component){};

    public void remove(Component component){};
}
