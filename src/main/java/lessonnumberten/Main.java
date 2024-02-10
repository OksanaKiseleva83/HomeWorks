package lessonnumberten;

import java.time.Year;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {

        /* Задание 1
         Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
         Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
         В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
         ФИО: фамилия имя отчество
         Год рождения: год рождения
         e-mail: email
         */
        User Herodotos = new User("Галикарнасский", "Геродот", "Ликсович", -484,
                "greeks.vs.persians@mail.ru");
        Herodotos.printUserInfo();

        //В методе main() Main класса создайте массив из 10 пользователей и заполните его объектам
        User[] arraySource = createUsersArray();

        //с помощью цикла выведите информацию только о пользователях старше 40 лет
        System.out.println("Пользователи старше 40 лет:");
        for (User user : arraySource) {
            if (Year.now().getValue() - user.getYearOfBirth() > 40) {
                user.printUserInfo();
            }
        }


        /* Задание 2
         * Попробуйте реализовать класс по его описания: объекты класса Коробка должны иметь размеры и цвет.
         * Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после создания нельзя.
         * У коробки должен быть метод, печатающий информацию о ней в консоль.
         * В коробку можно складывать предмет (если в ней нет предмета),
         * или выкидывать его оттуда (только если предмет в ней есть), только при условии что коробка открыта
         * (предметом читаем просто строку). Выполнение методов должно сопровождаться выводом сообщений в консоль
         */
        Box box = new Box("черный", 3, 2, 7);
        box.print();
        box.repaint("белый");
        box.get();
        box.put("книга");
        box.open();
        box.get();
        box.put("книга");
        box.put("ноутбук");
        box.get();
        box.close();
    }

    /**
     * создает 10 пользователей с рандомными данными
     *
     * @return массив типа User с созданными пользователями
     */
    public static User[] createUsersArray() {
        User[] users = new User[10];
        String surname, name, patronymic, email;
        int year, suffix;
        for (int i = 0; i < users.length; i++) {
            suffix = new Random().nextInt(10);
            surname = "Surname" + suffix;
            name = "Name" + suffix;
            patronymic = "Patronymic" + suffix;
            year = ThreadLocalRandom.current().nextInt(1974, 2024);
            email = "email" + suffix + "@mail.ru";
            users[i] = new User(surname, name, patronymic, year, email);
        }
        return users;
    }

}
