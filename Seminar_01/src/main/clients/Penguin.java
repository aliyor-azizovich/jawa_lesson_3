package main.clients;

import java.time.LocalDate;

public class Penguin extends Animal{
    public Penguin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    @Override
    public void fly() {
        System.out.println("Although a " + nickName + " is a bird, it cannot fly");
    }

    @Override
    public void toGo() {
        System.out.println(nickName + " ran but very slowly");
    }
}
