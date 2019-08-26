package com.hmy.create.builder.builder1;

import com.hmy.create.builder.builder1.model.House;

public interface IBuildHouse {

    void buildRoof();

    void buildWall();

    void buildDoor();

    House createHouse();
}
