package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Huntable{
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);

    }
    @Override
    public void toGo(){
        System.out.println(nickName + " is running");
    }
    @Override
    public void fly() {
        System.out.println("Dogs can't fly");
    }

    public Dog(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест с миски");
    }
}

