package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);

    }

    @Override
    public void toGo() {
        System.out.println(nickName + " is running");
    }


    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест с миски");
    }

    @Override
    public void swim() {

    }
}

