package main.clients;

import java.time.LocalDate;

public abstract class Animal {
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

    private void wakeUp(){
        System.out.println(nickName + " waked up");
    }
    public abstract void eat();
    private void sleep(){
        System.out.println(nickName + " sleeping");
    }
    private void wakeUp(String time){
        System.out.println(nickName + " waked up on " + time);
    }



    @Override
    public String toString() {
        return String.format("nickName = %s, birthDate = %s, owner = %s, illness = %s",
                nickName, birthDate, owner, illness);
    }

}

