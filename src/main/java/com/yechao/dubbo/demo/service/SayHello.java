package com.yechao.dubbo.demo.service;

import com.yechao.dubbo.demo.common.Person;

import java.util.Map;

public interface SayHello {
    public String say(String name);

    public void sayNothing();

    public String sayNo();

    public String sayPerson(Person person);

    public String sayMap(Map<String, Object> map);

    public String sayTwo(Person person, String name);

    public Map<String, String> sayReMap(String name);

    public String sayAge(int age);

}
