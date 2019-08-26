package com.hmy.create.builder.builder3.entity;

public class Person {

    private Long id;

    private String name;

    private int age;

    private String address;

    private Person(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class PersonBuilder {

        Person person;

        // 若id，name是必填属性，可以这样编写，当创建Person时，必须传入id，name
        public PersonBuilder(Long id, String name) {
           person = new Person();
           person.id = id;
           person.name = name;
        }

        // 若id，name 不是 必填属性，可以删除上面的PersonBuilder()，  打开下方的所有注释代码
        /* public PersonBuilder() {
            person = new Person();
        }*/

        //  链式调用============================
        /* public PersonBuilder id(Long id){
            person.id = id;
            return this;
        }

        public PersonBuilder name(String name){
            person.name = name;
            return this;
        }*/

        public PersonBuilder age(int age) {
            person.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            person.address = address;
            return this;
        }
        //  ====================================

        // 返回 person，令Builder建造的结果可以用Person接收，否则只能返回Person.PersonBuilder
        public Person build() {
            return person;
        }

    }


}