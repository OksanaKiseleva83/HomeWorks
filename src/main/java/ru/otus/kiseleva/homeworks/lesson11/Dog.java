package ru.otus.kiseleva.homeworks.lesson11;

public class Dog extends Animal {

    public Dog(String name, int speedRunning, int speedSwimming, int endurance, String type, int swimAbility) {
        super(name, speedRunning, speedSwimming, endurance,
                type, swimAbility);
    }

    @Override
    public String toString() {
        return "Dog\nname: " + name + "\nspeedRunning: " + speedRunning +
                "\nspeedSwimming: " + speedSwimming + "\nendurance: " + endurance + "\ntype: " + type;
    }

}
