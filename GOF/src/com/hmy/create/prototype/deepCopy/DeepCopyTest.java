package com.hmy.create.prototype.deepCopy;

public class DeepCopyTest {

    public static void main(String[] args) {
        System.out.println("深拷贝测试--- 串行化方式");
        DeepCopyGameMap deepCopyGameMap = new DeepCopyGameMap();
        DeepCopyLOLGameMap lolGameMap1 = new DeepCopyLOLGameMap("纳什男爵", deepCopyGameMap);
        lolGameMap1.setDeepCopyGameMap("树","山");

        System.out.println("地图1：" + lolGameMap1);

        DeepCopyLOLGameMap lolGameMap2 = (DeepCopyLOLGameMap) lolGameMap1.clone();
        lolGameMap2.setDeepCopyGameMap("树2", "山2");
        System.out.println("地图2：" + lolGameMap2);


        DeepCopyLOLGameMap lolGameMap3 = (DeepCopyLOLGameMap) lolGameMap2.clone();
        lolGameMap3.setDeepCopyGameMap("树3", "山3");
        System.out.println("地图3：" + lolGameMap3);

        System.out.println("重新查看前两个地图： ");
        System.out.println("地图1：" + lolGameMap1);
        System.out.println("地图2：" + lolGameMap2);
    }
}
