package com.hmy.create.builder.builder1;

import com.hmy.create.builder.builder1.model.House;

/**
 * @description:
 * 具体的建造者，实现接口
 */
public class BuildHouseImpl implements IBuildHouse{

    // 引用产品House
    private House house;

    public BuildHouseImpl() {
        house = new House();
    }

    @Override
    public void buildRoof() {
        house.setRoof("瓦片");
    }

    @Override
    public void buildWall() {
        house.setWall("土块");
    }

    @Override
    public void buildDoor() {
        house.setDoor("木头板");
    }

    @Override
    public House createHouse() {
        return house;
    }
}
