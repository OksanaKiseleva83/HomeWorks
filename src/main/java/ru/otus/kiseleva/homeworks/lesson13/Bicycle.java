package ru.otus.kiseleva.homeworks.lesson13;

public class Bicycle extends Transport implements Vehicle {

    public Bicycle() {
        super(1.0 / 0.0, 0.0 / 0.0);
    }

    public String getDefinitionType() {
        return "\"велосипед\"";
    }

    public boolean move(int distance, Terrain terrain) {
        boolean result = false;
        if (distance < 0) {
            System.out.println("Задано некорректное значение дистанции " + distance + " км.");
        } else {
            switch (terrain) {
                case SWAMP:
                    System.out.println("По болоту велосипед не едет.");
                    result = false;
                    break;
                case PLAIN:
                case WOOD:
                    System.out.println("Выполнено перемещение велосипеда на  " + distance + " км.");
                    result = true;
                    break;
            }
        }
        return result;
    }

}
