package com.hmy.create.builder.builder3;


import com.hmy.create.builder.builder3.entity.Person;

public class BuilderTest {

    public static void main(String[] args) {

        // id, name是必填属性
        Person person = new Person.PersonBuilder(12L, "lisi")
                .address("12345")
                .age(123)
                .build();

        // id, name 不是  必填属性
        // Person lisi = new Person.PersonBuilder()
        //         .address("12345")
        //         .age(123)
        //         .name("lisi")
        //         .build();

        System.out.println(person);
    }
}
