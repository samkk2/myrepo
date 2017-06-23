/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomp.mydepot.javamaven;

/**
 *
 * @author Winuser
 */
public class javamaven {
private String name;
private int age;

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

    @Override
    public String toString() {
        return "javamaven{" + "name=" + name + ", age=" + age + '}';
    }


}
