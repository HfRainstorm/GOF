package com.hmy.create.prototype.shallowCopy;

public class ShallowCopyTest {

    public static void main(String[] args) {
        System.out.println("浅拷贝测试");
        ShallowCopyGameMap gameMap = new ShallowCopyGameMap();
        ShallowCopyLOLGameMap lolGameMap1 = new ShallowCopyLOLGameMap("纳什男爵", gameMap);
        lolGameMap1.setGameMap("树","山");

        System.out.println("地图1：" + lolGameMap1);

        ShallowCopyLOLGameMap lolGameMap2 = (ShallowCopyLOLGameMap) lolGameMap1.clone();
        lolGameMap2.setGameMap("树2", "山2");
        System.out.println("地图2：" + lolGameMap2);


        ShallowCopyLOLGameMap lolGameMap3 = (ShallowCopyLOLGameMap) lolGameMap2.clone();
        lolGameMap3.setGameMap("树3", "山3");
        System.out.println("地图3：" + lolGameMap3);

        System.out.println("重新查看前两个地图： ");
        System.out.println("地图1：" + lolGameMap1);
        System.out.println("地图2：" + lolGameMap2);
    }
}
