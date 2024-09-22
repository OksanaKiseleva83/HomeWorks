package ru.otus.kiseleva.homeworks.lesson17;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        BinaryTreeNode btn = new BinaryTreeNode();
        btn = btn.createBinaryTreeFromSortedList();
        btn.print();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение, которое нужно найти в бинарном дереве поиска: ");
        int num = in.nextInt();
        Integer element = btn.find(num);
        if(Objects.nonNull(element)) {
            System.out.println(String.format("Искомое значение %s найдено", num));
        }else{
            System.out.println(String.format("Искомое значение %s не найдено", num));
        }
    }
}
