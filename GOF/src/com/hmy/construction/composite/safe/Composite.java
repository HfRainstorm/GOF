package com.hmy.construction.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * 树干，可以有叶子，或者其他更小的  子树干
 */
public class Composite extends Component {

    private String name;

    private int price;

    // 聚合抽象类
    private List<Component> childs = new ArrayList<>();

    public Composite() {
    }

    public Composite(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int totalPrice() {
        int num = this.price;

        // 使用stream流计算总价
        num += childs.stream().mapToInt(Component::totalPrice).sum();

        // 普通方式计算总价：遍历子节点，计算总价钱
        // for (Component c : childs) {
        //     num += c.totalPrice();
        // }

        return num;
    }

    // 添加子节点，其实就是向list中加入Component类型的值
    @Override
    public void add(Component component) {
        childs.add(component);
    }

    // 删除子节点，其实就是向list中移除Component类型的值
    @Override
    public void remove(Component component) {
        childs.remove(component);
    }
}
