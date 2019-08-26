package com.hmy.create.builder.builder2;

import com.hmy.create.builder.builder2.controller.util.ConvertUtils;
import com.hmy.create.builder.builder2.controller.vo.PersonVO;
import com.hmy.create.builder.builder2.entity.Person;

public class BuilderTest {

    public static void main(String[] args) {
        PersonVO personVO = new PersonVO();
        personVO.setAge(12);
        personVO.setName("lisi");
        personVO.setAddress("23434");

        ConvertUtils convertUtils = new ConvertUtils();
        Person person = convertUtils.convert2Person(personVO);
        System.out.println(person);

    }
}
