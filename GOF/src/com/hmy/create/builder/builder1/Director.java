package com.hmy.create.builder.builder1;

import com.hmy.create.builder.builder1.model.House;

public class Director {

    public House createHouseByDirector(IBuildHouse buildHouse) {
        buildHouse.buildRoof();
        buildHouse.buildWall();
        buildHouse.buildDoor();

        return buildHouse.createHouse();
    }
}
