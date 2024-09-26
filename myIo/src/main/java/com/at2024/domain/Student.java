package com.at2024.domain;

import java.io.Serializable;

/**
 * @author lyh
 * @date 2024-09-25 23:53:43
 * Serializable接口中是没有抽象方法的，这是标记型接口
 * 一旦实现了这个接口，就代表当前的Student可以被序列化
 *
 * 理解：   一个物品的合格证
 */
public class Student implements Serializable {
    //版本号，JVM会使用这个固定的版本号，而不是在javaBean改动之后，会发生变化
    //可以直接在idea中的setting中搜索Serializable，点击勾选
    private static final long serialVersionUID = 897832450906807318L;
    private String name;
    private int age;

    //transient修饰的属性不会被序列化，保证了数据的隐私
    private transient String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
