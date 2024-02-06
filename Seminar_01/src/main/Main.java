package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Animal cat = new Cat("Cat Mary", new Owner("Joh Doe"),
            LocalDate.of(2020, 10, 21), new Illness("sick"));
    Animal dog = new Dog("Dog Bob", new Owner("Will Smith"),
           LocalDate.of(2021, 05, 21), new Illness("flu"));
//    Animal penguin = new Penguin("Penguin Napoleon", new Owner("Barak Obama"),
//            LocalDate.of(2022, 02, 14), new Illness("sprained leg"));



        cat.eat();

    }
}
