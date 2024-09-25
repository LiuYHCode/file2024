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
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
