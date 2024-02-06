package main;

import main.clients.*;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Goable> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Penguin penguin = new Penguin();
        list.add(cat);
        list.add(dog);
        list.add(penguin);
        System.out.println(list);
        Animal animal = new Animal() {
            @Override
            public void eat() {

            }
        };
    }

}
