package com.yechao.dubbo.demo.service.impl;

import com.yechao.dubbo.demo.common.Person;
import com.yechao.dubbo.demo.service.SayHello;

import java.util.HashMap;
import java.util.Map;

@com.alibaba.dubbo.config.annotation.Service
public class SayHelloImpl implements SayHello {

    @Override
    public String say(String name) {
        return "Hello " + name + "!";
    }

    @Override
    public String sayNo() {
        return "NoNoNo";
    }

    @Override
    public void sayNothing() {
        System.out.println("111111111");
    }

    @Override
    public String sayPerson(Person person) {
        String str = "My name is " + person.getName() + "." + "My age is " + person.getAge() + ".My address is " + person.getAddress();
        return str;
    }

    @Override
    public String sayMap(Map<String, Object> map) {
        return map.get("map").toString();
    }

    @Override
    public String sayTwo(Person person, String name) {
        return person.getName() + " talk to " + name;
    }

    @Override
    public Map<String, String> sayReMap(String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @Override
    public String sayAge(int age) {
        return "age is " + age;
    }
}
