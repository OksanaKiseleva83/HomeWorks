package lessonnumbereleven;

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
        Dog dog = new Dog("Pink", 48,4,100, "собака");
        Cat cat = new Cat("Java", 10,-1,50, "кот");
        Horse horse = new Horse("Spirit", 71,20,1500, "лошадь");

        dog.info();
        dog.run(15);
        dog.info();
        dog.swim(5);
        dog.info();
        dog.run(100);
        dog.info();
        System.out.println();
        cat.info();
        cat.run(2);
        cat.info();
        cat.swim(5);
        cat.info();
        System.out.println();
        horse.info();
        horse.run(100);
        horse.info();
        horse.swim(10);
        horse.info();
        horse.run(1500);
        horse.info();
    }





}
