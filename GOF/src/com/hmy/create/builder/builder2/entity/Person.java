package com.hmy.create.builder.builder2.entity;

public class Person {

    private Long id;

    private String name;

    private int age;

    private String address;

    // public Long getId() {
    //     return id;
    // }
    //
    // public void setId(Long id) {
    //     this.id = id;
    // }
    //
    // public String getName() {
    //     return name;
    // }
    //
    // public void setName(String name) {
    //     this.name = name;
    // }
    //
    // public int getAge() {
    //     return age;
    // }
    //
    // public void setAge(int age) {
    //     this.age = age;
    // }
    //
    // public String getAddress() {
    //     return address;
    // }
    //
    // public void setAddress(String address) {
    //     this.address = address;
    // }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    Person(){}

    Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Person builder(){
        return new Person();
    }

    //  链式调用============================
    public Person name(String name){
        this.name = name;
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public Person address(String address) {
        this.address = address;
        return this;
    }
    //  ====================================
    public Person build(){
        return new Person(name,age,address);
    }

}