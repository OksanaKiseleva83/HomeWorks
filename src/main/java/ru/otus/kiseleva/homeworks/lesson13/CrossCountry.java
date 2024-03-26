package ru.otus.kiseleva.homeworks.lesson13;

public class CrossCountry extends Transport implements Vehicle {

    public CrossCountry(double limit, double rate) {
        super(limit, rate);
    }

    public String getDefinitionType(){
        return "\"вездеход\"";
    }

    public boolean move(int distance, Terrain terrain) {
        if (distance < 0) {
            System.out.println("Задано некорректное значение дистанции " + distance + " км.");
            return false;
        } else {
            if ((limit - distance * rate) > 0) {
                limit -= distance * rate;
                System.out.println("Выполнено перемещение вездехода на " + distance + " км" + " Осталось топлива " +
                        limit);
                return true;
            } else {
                System.out.println("У вездехода с расходом " + rate + " л/км недостаточно топлива " + limit + " для перемещения на дистанцию " + distance + " км");
                return false;
            }
        }
    }

}
