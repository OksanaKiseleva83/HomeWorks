package ru.otus.kiseleva.homeworks.lesson13;

public class Car extends Transport implements Vehicle {

    public Car(double limit, double rate) {
        super(limit, rate);
    }

    public String getDefinitionType() {
        return "\"машина\"";
    }

    public boolean move(int distance, Terrain terrain) {
        boolean result = false;
        if (distance < 0) {
            System.out.println("Задано некорректное значение дистанции " + distance + " км.");
            return result;
        } else {
            switch (terrain) {
                case WOOD:
                case SWAMP:
                    System.out.println("По густому лесу или болоту машина ехать не можеть");
                    result = false;
                    break;
                case PLAIN:
                    if ((limit - distance * rate) > 0) {
                        result = true;
                        limit -= distance * rate;
                        System.out.println("Выполнено перемещение машины на " + distance + " км" + " Осталось топлива " +
                                limit);
                    } else {
                        result = false;
                        System.out.println("У машины с расходом " + rate + " л/км недостаточно топлива " + limit + " для перемещения на дистанцию " + distance + " км");
                    }
                    break;
            }
            return result;
        }
    }

}
