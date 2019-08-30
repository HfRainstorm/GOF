package com.hmy.construction.decorator;

public class DecoratorTest {

    public static void main(String[] args) {

        Foods cake = new Cake(); // 创建一个蛋糕

        // 为蛋糕加入奶油  此时  cream 的super 是 cake
        Decorator cream = new Cream(cake);

        /*
            加入水果  此时  fruit 的super  是cream
            此时的cream的  super是cake
            所以包裹关系是： fruit（ cream（ cake） ）
         */
        Decorator fruit = new Fruit(cream);

        /*
            打印信息，由于先调用super.print() 然后是自己的system.out.println()
            所以 fruit调用cream的 print()
            cream的 print() 调用cake的 print()
         */
        fruit.print();
    }
}
