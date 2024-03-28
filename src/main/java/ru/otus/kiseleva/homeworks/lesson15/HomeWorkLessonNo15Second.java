package ru.otus.kiseleva.homeworks.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HomeWorkLessonNo15Second {
    public static void main(String[] args) {
        //for sumOfPositiveElements
        System.out.println(sumOfPositiveElements(Arrays.asList(1, 7, 3, 4, 5, 7)));
        System.out.println(sumOfPositiveElements(Arrays.asList(0, 0, 0, 0, 0, 0)));
        System.out.println(sumOfPositiveElements(Arrays.asList(-1, 0, 0, 0, 0, 0)));
        System.out.println(sumOfPositiveElements(Arrays.asList()));
        System.out.println(sumOfPositiveElements(Arrays.asList(-5, 5)));
        System.out.println(sumOfPositiveElements(Arrays.asList(-5, -5)));
        System.out.println(sumOfPositiveElements(Arrays.asList(-5, 10)));

        //for replaceArrayMembersByCondition
        replaceArrayMembersByCondition(7,Arrays.asList(1, 7, 3, 4, 5, 7));
        replaceArrayMembersByCondition(7,Arrays.asList(0, 0, 0, 0, 0, 0));
        replaceArrayMembersByCondition(7,Arrays.asList(0));
        replaceArrayMembersByCondition(7,Arrays.asList(9));
        replaceArrayMembersByCondition(7,Arrays.asList(-1));
        replaceArrayMembersByCondition(7,Arrays.asList());

        //for incrementArrayMembers
        incrementArrayMembers(7, Arrays.asList(1, 7, 3, 4, 5, 7));
        incrementArrayMembers(7, Arrays.asList(0, 0, 0, 0, 0, 0));
        incrementArrayMembers(7, Arrays.asList(0));
        incrementArrayMembers(7, Arrays.asList(9));
        incrementArrayMembers(7, Arrays.asList(-1));
        incrementArrayMembers(7, Arrays.asList());
        incrementArrayMembers(-7, Arrays.asList(1, 7, 3, 4, 5, 7));
        incrementArrayMembers(-7, Arrays.asList(0, 0, 0, 0, 0, 0));
        incrementArrayMembers(-7, Arrays.asList(0));
        incrementArrayMembers(-7, Arrays.asList(9));
        incrementArrayMembers(-7, Arrays.asList(-1));
        incrementArrayMembers(-7, Arrays.asList());
    }

    /**
     * Реализуйте метод, принимающий в качестве аргумента список целых чисел,
     * суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
     */
    public static int sumOfPositiveElements(List<Integer> arraySource) {
        int summary = 0;
        for (Integer i : arraySource) {
            if (i > 5) {
                summary += i;
            }
        }
        return summary;
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
     * метод должен переписать каждую заполненную ячейку списка указанным числом;
     */
    public static void replaceArrayMembersByCondition(int number, List<Integer> arraySource) {
        for (int i = 0; i < arraySource.size(); i++) {
            if (Objects.nonNull(arraySource.get(i))) {
                arraySource.set(i, number);
            }
        }
        System.out.println(arraySource);
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
     * увеличивающий каждый элемент списка на указанное число;
     */
    public static void incrementArrayMembers(int number, List<Integer> arraySource) {
        for (int i = 0; i < arraySource.size(); i++) {
            arraySource.set(i, arraySource.get(i) + number);
        }
        System.out.println(arraySource);
    }

}
