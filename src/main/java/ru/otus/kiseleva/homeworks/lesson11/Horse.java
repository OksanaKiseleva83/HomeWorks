package ru.otus.kiseleva.homeworks.lesson11;

public class Horse extends Animal {

    public Horse(String name, int speedRunning, int speedSwimming, int endurance, String type,int swimAbility) {
        super(name, speedRunning, speedSwimming, endurance,
                type,swimAbility);
    }

    @Override
    public String toString() {
        return "Horse\nname: " + name + "\nspeedRunning: " + speedRunning +
                "\nspeedSwimming: " + speedSwimming + "\nendurance: " + endurance + "\ntype: " + type;
    }

}
