package com.hmy.create.prototype.deepCopy;

import java.io.*;

/**
 * @description:
 * 通过串行化方式进行深拷贝
 */
public class DeepCopyLOLGameMap implements Serializable {

    private String dragon;

    private DeepCopyGameMap deepCopyGameMap;


    public DeepCopyLOLGameMap(String dragon, DeepCopyGameMap deepCopyGameMap) {
        this.dragon = dragon;
        this.deepCopyGameMap = deepCopyGameMap;
    }

    public String getDragon() {
        return dragon;
    }

    public void setDragon(String dragon) {
        this.dragon = dragon;
    }

    public DeepCopyGameMap getDeepCopyGameMap() {
        return deepCopyGameMap;
    }

    public void setDeepCopyGameMap(String tree, String mountain) {
        deepCopyGameMap.setTree(tree);
        deepCopyGameMap.setMountain(mountain);
    }

    // 串行化方式进行深拷贝
    public DeepCopyLOLGameMap clone() {
        DeepCopyLOLGameMap clone = null;

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            //写入当前对象的二进制流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            //读出二进制流产生新的对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);

            clone = (DeepCopyLOLGameMap)ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                // 关闭流
                assert oos != null;
                oos.close();

                assert ois != null;
                ois.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

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
