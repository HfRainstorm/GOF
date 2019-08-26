package com.hmy.create.builder.builder1.model;

/**
 * @description:
 * 具体的产品
 */
public class House {

    private String roof;

    private String wall;

    private String door;

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", wall='" + wall + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
