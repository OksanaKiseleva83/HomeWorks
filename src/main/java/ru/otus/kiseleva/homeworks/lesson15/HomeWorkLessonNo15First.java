package ru.otus.kiseleva.homeworks.lesson15;

import ru.otus.kiseleva.homeworks.lesson15.exception.AppArrayRangeException;

import java.util.ArrayList;
import java.util.Random;

public class HomeWorkLessonNo15First {

    public static void main(String[] args) {
        try {
            System.out.println(getArrayListWithDataInRange(1, 6));
            System.out.println(getArrayListWithDataInRange(0, 6));

        } catch (AppArrayRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getArrayListWithDataInRange(10, 0));
        } catch (AppArrayRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getArrayListWithDataInRange(-1, -9));
        } catch (AppArrayRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getArrayListWithDataInRange(0, 0));
        } catch (AppArrayRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов числа min и max,
     * и возвращающий ArrayList с набором последовательных значений
     * в указанном диапазоне (min и max включительно, шаг - 1);
     */
    public static ArrayList<Integer> getArrayListWithDataInRange(int min, int max) throws AppArrayRangeException {
        if (max < min || max == min) throw new AppArrayRangeException(min, max);
        ArrayList<Integer> result = new ArrayList<>();
        Random rn = new Random();
        int size = (max - min) + 1;
        for (int i = 0; i < size; i++) {
            int tmp = rn.nextInt(size) + min;
            result.add(tmp);
        }
        return result;
    }

}
