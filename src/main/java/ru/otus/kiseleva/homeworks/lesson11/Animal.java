package ru.otus.kiseleva.homeworks.lesson11;

public abstract class Animal {

    protected String name;

    protected int speedRunning;

    protected int speedSwimming;

    protected int endurance;

    protected String type;

    public Animal(String name, int speedRunning, int speedSwimming, int endurance,String type) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.endurance = endurance;
        this.type=type;
    }

    public int run(int distance) {
        if (endurance > 0){
            endurance -= distance;
            return distance / speedRunning;
        }else{
            System.out.println("У животного " + type + " с именем " + name + " появилось состояние усталости! Бег невозможен.");
            return -1;
        }
    }

    public abstract int swim(int distance);

    public void info() {
        System.out.println(this.toString());
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSpeedRunning() {
//        return speedRunning;
//    }
//
//    public void setSpeedRunning(int speedRunning) {
//        this.speedRunning = speedRunning;
//    }
//
//    public int getSpeedSwimming() {
//        return speedSwimming;
//    }
//
//    public void setSpeedSwimming(int speedSwimming) {
//        this.speedSwimming = speedSwimming;
//    }
//
//    public int getEndurance() {
//        return endurance;
//    }
//
//    public void setEndurance(int endurance) {
//        this.endurance = endurance;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
}
