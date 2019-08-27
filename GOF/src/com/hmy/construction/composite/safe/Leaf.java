package com.hmy.construction.composite.safe;

/**
 * @description:
 * 叶子节点，无法进行添加和删除操作
 *      透明式的组合模式：叶子节点中的添加和删除操作用不到，但是必须要有
 */
public class Leaf extends Component {

    private String name;

    private int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int totalPrice() {
        return this.price;
    }

}
