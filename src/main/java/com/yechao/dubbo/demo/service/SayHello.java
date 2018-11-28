package com.yechao.dubbo.demo.service;

import com.alibaba.dubbo.common.json.JSONObject;
import com.yechao.dubbo.demo.common.Person;

import java.util.Map;

public interface SayHello {
    public String say(String name);

    public void sayNothing();

    public String sayNo();

    public String sayPerson(Person person);

    public String sayMap(Map<String, Object> map);

    public String sayTwo(Person person, String name);

    public Map<String, Object> sayReMap(String name, Integer age, Double d);

    public String sayAge(int age);

    public com.alibaba.fastjson.JSONObject sayName(char ch);

    public Person tellPerson(double d);

    public JSONObject sayDubboJSON(short s);

    public Person getPerson(int age, String name, String address, String phoen);


}
