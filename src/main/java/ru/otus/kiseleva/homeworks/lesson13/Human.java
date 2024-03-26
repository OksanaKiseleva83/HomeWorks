package ru.otus.kiseleva.homeworks.lesson13;

import java.util.Objects;

public class Human {

    private String name;

    private Vehicle currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getOn(Vehicle vehicle) {
        if (Objects.isNull(currentTransport)) {
            currentTransport = vehicle;
        } else {
            System.out.println("Человек уже использует транспортное средство " + currentTransport.getDefinitionType()
                    + ". Сначала нужно покинуть его.");
        }
    }

    public void getOff() {
        if (Objects.nonNull(currentTransport)) {
            currentTransport = null;
        }else{
            System.out.println("Человек сейчас не использует транспортное средство.");
        }
    }

    public Vehicle getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Vehicle transport) {
        currentTransport = transport;
    }

    public boolean reachTo(int distance, Terrain terrain) {
        boolean result = false;
        if (Objects.nonNull(currentTransport)) {
            if (currentTransport instanceof CrossCountry || currentTransport instanceof Car) {
                System.out.println("Человек " + name + " на транспорте");
            } else {
                if (currentTransport instanceof Bicycle) {
                    System.out.println("Человек " + name + " на велосипеде");
                } else {
                    System.out.println("Человек " + name + " на лошади");
                }
            }
            result = currentTransport.move(distance, terrain);
        } else {
            System.out.println("Человек " + name + " пойдет пешком");
            result = true;
        }
        return result;
    }
}
