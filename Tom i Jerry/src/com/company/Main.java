package com.company;

public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat("Toм");
        Dog myDog = new Dog("Спайк");
        Mouse myMouse = new Mouse("Джери");

        myCat.move();
        myCat.eat();
        myDog.move();
        myDog.eat();
        myMouse.move();
        myMouse.eat();

    }
}
