package com.hmy.create.singleton;

public class Singleton2 {

    private volatile static Singleton2 instance = null;

    private Singleton2() {
        System.out.println("Sigleton的无参构造函数初始化了");
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized(Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
