package thirdlesson;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkThirdLesson {
    public static void main(String[] args) {
        randomSelection();
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        String result = (a + b + c) >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    public static void selectColor() {
        int data = new Random().nextInt(25);
        System.out.print(data + " ");
        if (data <= 10) System.out.println("Красный");
        else {
            if (data <= 20) System.out.println("Желтый");
            else {
                System.out.println("Зеленый");
            }
        }
    }

    public static void compareNumbers() {
        int a = new Random().nextInt(10);
        int b = new Random().nextInt(10);
        System.out.print("a=" + a + ", b=" + b + " : ");
        if (a >= b) System.out.println("a >= b");
        else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue += delta);
        } else {
            System.out.println(initValue -= delta);
        }
    }

    public static void randomSelection() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        switch (num) {
            case 1:
                greetings();
                break;
            case 2:
                checkSign(-9, -1, 9);
                checkSign(0, 0, 9);
                checkSign(0, 0, 0);
                break;
            case 3:
                selectColor();
                break;
            case 4:
                compareNumbers();
                break;
            case 5:
                addOrSubtractAndPrint(0, 5, true);
                addOrSubtractAndPrint(0, 5, false);
                break;
        }
    }
}
