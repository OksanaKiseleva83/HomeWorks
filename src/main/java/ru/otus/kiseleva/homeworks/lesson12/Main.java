package ru.otus.kiseleva.homeworks.lesson12;

public class Main {

    public static void main(String[] args) {
        System.out.println("TEST1");
        TEST1();
        System.out.println("==================================");
        System.out.println("TEST2");
        TEST2();
        System.out.println("==================================");
        System.out.println("TEST3");
        TEST3();
        System.out.println("==================================");
        System.out.println("TEST4");
        TEST4();
        System.out.println("==================================");
        System.out.println("TEST5");
        TEST5();
    }

    private static void TEST1(){
        Cat[] cats = {new Cat("Леопольд", 10),
                new Cat("Матроскин", 15),
                new Cat("Гав", 2),
                new Cat("Василий с улицы Лизюкова", 5),
                new Cat("Матильда", 7)};
        Plate plate = new Plate(18);
        for(Cat c : cats){
            c.eat(plate);
            c.info();
        }
    }

    private static void TEST2(){
        Cat[] cats = {new Cat("Леопольд", 10),
                new Cat("Матроскин", 15),
                new Cat("Гав", 2),
                new Cat("Василий с улицы Лизюкова", 5),
                new Cat("Матильда", 7)};
        Plate plate = new Plate(0);
        for(Cat c : cats){
            c.eat(plate);
            c.info();
        }
    }

    private static void TEST3(){
        Cat[] cats = {new Cat("Леопольд", 10),
                new Cat("Матроскин", -1),
                new Cat("Гав", 2),
                new Cat("Василий с улицы Лизюкова", 5),
                new Cat("Матильда", 7)};
        Plate plate = new Plate(-1);
        for(Cat c : cats){
            c.eat(plate);
            c.info();
        }
    }

    private static void TEST4(){
        Cat[] cats = {new Cat("Леопольд", -1),
                new Cat("Матроскин", 15),
                new Cat("Гав", 0),
                new Cat("Василий с улицы Лизюкова", 5),
                new Cat("Матильда", 7)};
        Plate plate = new Plate(20);
        for(Cat c : cats){
            c.eat(plate);
            c.info();
        }
    }

    private static void TEST5(){
        Cat[] cats = {new Cat("Леопольд", 0),
                new Cat("Матроскин", -1),
                new Cat("Гав", 0),
                new Cat("Василий с улицы Лизюкова", -1),
                new Cat("Матильда", 0)};
        Plate plate = new Plate(0);
        for(Cat c : cats){
            c.eat(plate);
            c.info();
        }
    }

}
