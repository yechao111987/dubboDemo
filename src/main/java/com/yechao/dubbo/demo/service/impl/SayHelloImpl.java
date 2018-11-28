package com.yechao.dubbo.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
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
    public Map<String, Object> sayReMap(String name, Integer age,Double d) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        map.put("double",d);
        return map;
    }

    @Override
    public String sayAge(int age) {
        return "age is " + age;
    }

    @Override
    public com.alibaba.fastjson.JSONObject sayName(char ch) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", String.valueOf(ch));
        jsonObject.put("name1", "name1");
        return jsonObject;
    }

    @Override
    public Person tellPerson(double d) {
        Person person = new Person();
        person.setName(String.valueOf(d));
        return person;
    }

    @Override
    public com.alibaba.dubbo.common.json.JSONObject sayDubboJSON(short s) {
        com.alibaba.dubbo.common.json.JSONObject jsonObject = new com.alibaba.dubbo.common.json.JSONObject();
        jsonObject.put("short", s);
        System.out.println(jsonObject.toString());
        return jsonObject;
    }

    @Override
    public Person getPerson(int age, String name, String address, String phoen) {
        Person person = new Person();
        person.setName(name);
        person.setAddress(address);
        person.setAge(age);
        person.setPhone(phoen);
        return person;
    }
}
