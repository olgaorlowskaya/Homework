package com.company;

    class Dog extends Animals {
        static String name;
        Dog(String name) {
            this.name = name;
        }

        void move() {
            System.out.println(name + " может легко догнать обоих.");}
        void eat() {
            System.out.println("И съесть кого захочет.");}}

