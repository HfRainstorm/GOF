package com.hmy.create.prototype.deepCopy;

public class DeepCopyTest2 {

    public static void main(String[] args) {
        System.out.println("深拷贝测试----  非串行化方式");
        DeepCopyGameMap2 deepCopyGameMap = new DeepCopyGameMap2();
        deepCopyGameMap.setTree("树");
        deepCopyGameMap.setMountain("山");
        DeepCopyLOLGameMap2 lolGameMap1 = new DeepCopyLOLGameMap2("纳什男爵",deepCopyGameMap);
        lolGameMap1.setDeepCopyGameMap2("树","山");

        System.out.println("地图1：" + lolGameMap1);

        DeepCopyLOLGameMap2 lolGameMap2 = (DeepCopyLOLGameMap2) lolGameMap1.clone();
        lolGameMap2.setDeepCopyGameMap2("树2", "山2");
        System.out.println("地图2：" + lolGameMap2);


        DeepCopyLOLGameMap2 lolGameMap3 = (DeepCopyLOLGameMap2) lolGameMap2.clone();
        lolGameMap3.setDeepCopyGameMap2("树3", "山3");
        System.out.println("地图3：" + lolGameMap3);

        System.out.println("重新查看前两个地图： ");
        System.out.println("地图1：" + lolGameMap1);
        System.out.println("地图2：" + lolGameMap2);
    }
}
