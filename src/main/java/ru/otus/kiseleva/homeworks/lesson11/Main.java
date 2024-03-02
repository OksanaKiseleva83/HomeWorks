package ru.otus.kiseleva.homeworks.lesson11;

public class Main {

    public static void main(String[] args) {

        /*
         * Задание 1
         * Создайте классы Cat, Dog и Horse с наследованием от класса Animal
         * У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
         * Затраты выносливости:
         * Все животные на 1 метр бега тратят 1 ед выносливости,
         * Собаки на 1 метр плавания - 2 ед.
         * Лошади на 1 метр плавания тратят 4 единицы
         * Кот плавать не умеет.
         * Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное
         * на указанное действие, и “понижать выносливость” животного. Если выносливости не хватает,
         * то возвращаем время -1 и указываем что у животного появилось состояние усталости.
         * При выполнении действий пишем сообщения в консоль.
         * Добавляем метод info(), который выводит в консоль состояние животного.
         */
        Dog dogFirst = new Dog("Pink", 48,4,100, "собака",2);
        Dog dogSecond = new Dog("Border", 48,-1,100, "собака",2);
        Dog dogThird = new Dog("Candy", 48,4,1, "собака",2);
        Cat cat = new Cat("Java", 10,-1,50, "кот", 0);
        Horse spirit = new Horse("Spirit", 71,20,1500, "лошадь", 4);
        Horse soul = new Horse("Soul", 71,-1,1500, "лошадь", 4);
        Horse turtle = new Horse("Turtle", 0,0,1000, "лошадь", 4);

        dogFirst.info();
        dogFirst.run(15);
        dogFirst.info();
        dogFirst.swim(5);
        dogFirst.info();
        dogFirst.run(100);
        dogFirst.info();
        dogFirst.run(100);
        dogFirst.info();
        System.out.println();
        cat.info();
        cat.run(2);
        cat.info();
        cat.swim(5);
        cat.info();
        System.out.println();
        spirit.info();
        spirit.run(100);
        spirit.info();
        spirit.swim(10);
        spirit.info();
        spirit.run(1500);
        spirit.info();
        spirit.run(1500);
        spirit.info();
        System.out.println();
        dogSecond.info();
        dogSecond.run(100);
        dogSecond.info();
        dogSecond.swim(10);
        dogSecond.info();
        System.out.println();
        soul.info();
        soul.swim(10);
        soul.info();
        System.out.println();
        turtle.info();
        turtle.run(15);
        turtle.info();
        turtle.swim(5);
        turtle.info();
        System.out.println();
        dogThird.info();
        dogThird.run(150);
        dogThird.info();
        dogThird.swim(5);
        dogThird.info();
    }





}
