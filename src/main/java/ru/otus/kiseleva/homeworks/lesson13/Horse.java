package ru.otus.kiseleva.homeworks.lesson13;

public class Horse extends Transport implements Vehicle{

    public Horse(double limit, double rate) {
        super(limit,rate);
    }

    public String getDefinitionType(){
        return "\"лошадь\"";
    }

    public boolean move(int distance, Terrain terrain) {
        boolean result = false;
        if (distance < 0) {
            System.out.println("Задано некорректное значение дистанции " + distance + " км.");
        } else {
            switch (terrain) {
                case SWAMP:
                    System.out.println("По болоту лошадь скакать не может.");
                    result = false;
                    break;
                case PLAIN:
                case WOOD:
                    if ((limit - distance * rate) > 0) {
                        result = true;
                        limit -= distance * rate;
                        System.out.println("Лошадь проскакала " + distance + " км" + " Запас сил " + limit);
                    } else {
                        result = false;
                        System.out.println("У лошади с расходом  " + rate + " л.с./км недостаточно сил " + limit + " для перемещения на дистанцию " + distance + " км");
                    }
                    break;
            }
        }
        return result;
    }

}
