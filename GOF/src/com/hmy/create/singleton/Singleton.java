package com.hmy.create.singleton;

public class Singleton {


    private Singleton() {
        System.out.println("Sigleton的无参构造函数初始化了");
    }

    public static Singleton getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {

        private static Singleton instance = null;

        static {
            System.out.println("InnerClass 静态代码初始化了");
            instance = new Singleton();
        }
    }
}
