package ru.otus.kiseleva.homeworks.lesson11;

public abstract class Animal {

    protected String name;

    protected int speedRunning;

    protected int speedSwimming;

    protected int endurance;

    protected String type;

    protected int swimAbility;

    public Animal(String name, int speedRunning, int speedSwimming, int endurance, String type, int swimAbility) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.endurance = endurance;
        this.type = type;
        this.swimAbility = swimAbility;
    }

    public int run(int distance) {
        if (speedRunning <= 0) {
            System.out.println("Животное " + type + " с именем " + name + " не умеет бегать!");
            return -1;
        }
        if (endurance > 0) {
            if (endurance >= distance) {
                endurance -= distance;
                return distance / speedRunning;
            } else {
                System.out.println("У животного " + type + " с именем " + name + " выносливость " + endurance +
                        " недостаточна для бега на дистанции " + distance);
                return -1;
            }
        } else {
            System.out.println("У животного " + type + " с именем " + name + " появилось состояние усталости! Бег невозможен.");
            return -1;
        }
    }

    public int swim(int distance) {
        if (swimAbility <= 0 || speedSwimming <= 0) {
            System.out.println("Животное " + type + " с именем " + name + " не умеет плавать!");
            return -1;
        }
        if (endurance > 0) {
            if (endurance >= swimAbility * distance) {
                endurance -= swimAbility * distance;
                return distance / speedSwimming;
            } else {
                System.out.println("У животного " + type + " с именем " + name + " выносливость " + endurance +
                        " недостаточна, чтобы плыть на дистанции " + distance);
                return -1;
            }
        } else {
            System.out.println("У животного " + type + " появилось состояние усталости! Плыть невозможно.");
            return -1;
        }
    }

    public void info() {
        System.out.println(this.toString());
    }
}
