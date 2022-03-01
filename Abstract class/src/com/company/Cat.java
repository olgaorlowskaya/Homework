package com.company;

class Cat extends Animals {
    static String name;
    Cat(String name) {
        this.name = name;
    }

    void move() {
        System.out.println(name + " может передвигаться и красться за " + Mouse.name + ".");}
    void eat() {
        System.out.println(name + " может съесть " + Mouse.name + ".");}}

