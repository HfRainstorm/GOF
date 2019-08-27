package com.hmy.construction.composite.transparency;

public class TransparencyCompositeTest {

    // 透明式的组合模式：new 的时候不需要区分是叶子还是树干
    public static void main(String[] args) {
        Component root = new Composite();

        Component computerCase = new Composite("机箱", 500);

        Component mainBoard = new Composite("主板",1000);
        // 不管是不是叶子，都统一使用树干创建
        Component gpu = new Composite("显卡",2000);
        Component cpu = new Composite("cpu",1200);

        // 不管是不是叶子，都统一使用树干创建
        Component keyboard = new Composite("键盘", 200);
        Component screen = new Composite("显示屏", 400);


        // 在主板上安装cpu和显卡
        mainBoard.add(cpu);
        mainBoard.add(gpu);

        // 在机箱中安装集成后的主板
        computerCase.add(mainBoard);

        // 加入根结点
        root.add(computerCase);
        root.add(screen);
        root.add(keyboard);

        /* 组装的先后顺序没有强制要求，先从根结点开始组装也是可以的 */

        // 输出总价格
        System.out.println(root.totalPrice());
    }
}
