package com.at2024.mytest;

import java.io.Serializable;

/**
 * @author lyh
 * @date 2024-09-26 23:49:33
 */
public class Students implements Serializable {
    private static final long serialVersionUID = 8692493062860722948L;
    private String name;
    private int age;
    private String address;

    public Students(String name, int age, String address) {
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
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
