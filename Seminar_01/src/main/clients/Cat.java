package main.clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Huntable, Flyable, Swimable{
    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Cat() {
        super();
    }
    @Override
    public void toGo(){
        System.out.println(nickName + " is running");
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест");
    }

    @Override
    public void fly() {
       System.out.println("Cats can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Cats don't like to swim");;
    }


}
