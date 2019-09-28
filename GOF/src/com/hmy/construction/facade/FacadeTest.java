package com.hmy.construction.facade;

/**
 * @date 2019-09-28 10:48
 */
public class FacadeTest {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.planA();

        System.out.println("=========优雅而不失华丽的分隔线========");

        facade.planB();
    }
}
