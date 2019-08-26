package com.hmy.create.prototype.shallowCopy;

/**
 * @description:
 * 浅拷贝
 */
public class ShallowCopyLOLGameMap implements Cloneable {

    private String dragon;

    private ShallowCopyGameMap gameMap;


    public ShallowCopyLOLGameMap(String dragon, ShallowCopyGameMap gameMap) {
        this.dragon = dragon;
        this.gameMap = gameMap;
    }

    public String getDragon() {
        return dragon;
    }

    public void setDragon(String dragon) {
        this.dragon = dragon;
    }

    public ShallowCopyGameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(String tree, String mountain) {
        gameMap.setTree(tree);
        gameMap.setMountain(mountain);
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "{" +
                "dragon='" + dragon + '\'' +
                ", gameMap=" + gameMap +
                '}';
    }
}
