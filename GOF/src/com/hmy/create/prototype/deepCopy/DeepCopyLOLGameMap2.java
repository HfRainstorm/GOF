package com.hmy.create.prototype.deepCopy;

/**
 * @description:
 * 通过转换为二进制进行深拷贝
 */
public class DeepCopyLOLGameMap2 implements Cloneable {

    private String dragon;

    private DeepCopyGameMap2 deepCopyGameMap;


    public DeepCopyLOLGameMap2(String dragon, DeepCopyGameMap2 deepCopyGameMap) {
        this.dragon = dragon;
        this.deepCopyGameMap = deepCopyGameMap;
    }

    public String getDragon() {
        return dragon;
    }

    public void setDragon(String dragon) {
        this.dragon = dragon;
    }

    public DeepCopyGameMap2 getGameMap() {
        return deepCopyGameMap;
    }

    public void setDeepCopyGameMap2(String tree, String mountain) {
        deepCopyGameMap.setTree(tree);
        deepCopyGameMap.setMountain(mountain);
    }

    // 非串行化方式， 在LOLGameMap的clone()方法中调用总地图的clone()方法
    public DeepCopyLOLGameMap2 clone() {
        DeepCopyLOLGameMap2 clone = null;
        try {
            clone = (DeepCopyLOLGameMap2)super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assert clone != null;
        // 深浅拷贝的区别在这里！！！！！
        clone.deepCopyGameMap = (DeepCopyGameMap2) deepCopyGameMap.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "{" +
                "dragon='" + dragon + '\'' +
                ", deepCopyGameMap=" + deepCopyGameMap +
                '}';
    }
}
