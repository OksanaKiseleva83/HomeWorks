package ru.otus.kiseleva.homeworks.lesson11;

public class Dog extends Animal {

    public Dog(String name, int speedRunning, int speedSwimming, int endurance, String type) {
        super(name, speedRunning, speedSwimming, endurance,type);
    }

    @Override
    public int swim(int distance) {
        if(speedSwimming < 0 ) {
            System.out.println("Животное " + type + " с именем " + name + " не умеет плавать!");
            return -1;
        }
        if (endurance > 0) {
            endurance -= 2 * distance;
            return distance / speedSwimming;
        }else{
            System.out.println("У " + type + " появилось состояние усталости! Плыть невозможно.");
            return  -1;
        }
    }

    @Override
    public String toString() {
        return "Dog\nname: " + name + "\nspeedRunning: " + speedRunning +
                "\nspeedSwimming: " + speedSwimming + "\nendurance: " + endurance + "\ntype: " + type;
    }

}
