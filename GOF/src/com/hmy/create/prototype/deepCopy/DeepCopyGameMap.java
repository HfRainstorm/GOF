package com.hmy.create.prototype.deepCopy;

import java.io.Serializable;

public class DeepCopyGameMap implements Serializable {

    private String tree;

    private String mountain;

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }

    @Override
    public String toString() {
        return "{" +
                "tree='" + tree + '\'' +
                ", mountain='" + mountain + '\'' +
                '}';
    }
}
