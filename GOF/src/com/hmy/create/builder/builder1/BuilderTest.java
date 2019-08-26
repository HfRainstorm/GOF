package com.hmy.create.builder.builder1;

import com.hmy.create.builder.builder1.model.House;

public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        House houseByDirector = director.createHouseByDirector(new BuildHouseImpl());

        System.out.println(houseByDirector);
    }
}
