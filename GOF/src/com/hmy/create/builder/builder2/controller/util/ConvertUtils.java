package com.hmy.create.builder.builder2.controller.util;

import com.hmy.create.builder.builder2.controller.vo.PersonVO;
import com.hmy.create.builder.builder2.entity.Person;

public class ConvertUtils {

    public Person convert2Person(PersonVO personVO){

        return Person.builder()
                .name(personVO.getName())
                .age(personVO.getAge())
                .address(personVO.getAddress())
                .build();
    }
}
