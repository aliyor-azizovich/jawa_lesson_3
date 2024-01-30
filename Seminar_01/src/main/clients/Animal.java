package main.clients;

import java.time.LocalDate;

public class Animal {
protected String nickName;
protected Owner owner;
protected LocalDate birthDate;
private Illness illness;

public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
    this.nickName = nickName;
    this.owner = owner;
    this.birthDate = birthDate;
    this.illness = illness;
    }

    public Animal() {
    this.nickName = "Кличка";
    this.owner = new Owner("Хозяин");
    this.birthDate = LocalDate.now();
    this.illness = new Illness("Болезнь");
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getType(){
    return getClass().getSimpleName();
    }
    public void lifeCycle(){
    wakeUp();
    swim();
    toGo();
    hunt();
    fly();
    eat();
    sleep();
    }
    private void wakeUp(){
        System.out.println(nickName + " waked up");
    }
    private void hunt(){
        System.out.println(nickName + " hunting");
    }
    private void eat(){
        System.out.println(nickName + " eating");
    }
    private void sleep(){
        System.out.println(nickName + " sleeping");
    }
    private void wakeUp(String time){
        System.out.println(nickName + " waked up on " + time);
    }
    public void swim(){
        System.out.println(nickName + " is swimming");
    }
    public void fly(){
        System.out.println(nickName + " is flying");
    }
    public void toGo(){
        System.out.println(nickName + " is running");
    }
    @Override
    public String toString() {
        return String.format("nickName = %s, birthDate = %s, owner = %s, illness = %s",
                nickName, birthDate, owner, illness);
    }

}

