package com.company;

    class Mouse extends Animals{
        static String name;
        Mouse(String name) {
            this.name = name;
        }

        void move() {
            System.out.println(name + " быстро бегает от своих обидчиков.");}
        void eat() {
            System.out.println("Потому что никого не может съесть.");}}


