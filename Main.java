package com.company;

public class Main {
    public static void main(String[] args) {

        Dog doggy = new Dog("Julia");
        Cat catty = new Cat("Vasya");
        Animal[] animals = new Animal[2];
        animals[0] = doggy;
        animals[1] = catty;

        for (int i = 0; i < animals.length; i++) {
            makeSounds(animals[i]);
        }
    }

    private static void makeSounds(Animal animalTest) {
        if (animalTest instanceof Dog) {
            ((Dog) animalTest).bark();
        } else if (animalTest instanceof Cat) {
            ((Cat) animalTest).miauu();
        } else {
            throw new ClassCastException(" Unknown class");
        }
    }

}











