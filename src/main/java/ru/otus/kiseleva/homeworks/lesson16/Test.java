package ru.otus.kiseleva.homeworks.lesson16;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        testOne();
        testTwo();
        testThree();
        testFour();
        testFive();
        testSix();
        testSeven();
    }

    public static  void testOne(){
        System.out.print("TEST 1: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055969L,"Иванова",true);
        book1.add(89263055970L,"Петрова",true);
        book1.add(89263055971L,"Сидорова",true);
        book1.add(89263055972L,"Кузнецова",true);
        System.out.println(book1.getMappingNameAndPhone());
    }

    public static void testTwo(){
        System.out.print("TEST 2: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055969L,"Петрова",false);
        book1.add(89263055969L,"Иванова",false);
        System.out.println(book1.getMappingNameAndPhone());
    }

    public static void testThree(){
        System.out.print("TEST 3: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055969L,"Петрова",false);
        book1.add(89263055969L,"Иванова",true);
        System.out.println(book1.getMappingNameAndPhone());
    }

    public static void testFour(){
        System.out.print("TEST 4: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055971L,"Сидорова",true);
        book1.add(89263055971L,"Мамин-Сибиряк",true);
        System.out.println(book1.getMappingNameAndPhone());
    }

    public static void testFive(){
        System.out.print("TEST 5: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055971L,"О'Генри",true);
        book1.add(89263055971L,"Бальзак",false);
        System.out.println(book1.getMappingNameAndPhone());
    }

    public static void testSix(){
        System.out.print("TEST 6: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055971L,"О'Генри",true);
        book1.add(89263055972L,"О'Генри",true);
        book1.add(89263055973L,"О'Генри",true);
        book1.add(89263055974L,"О'Генри",true);
        System.out.println(book1.find("О'Генри"));
    }

    public static void testSeven(){
        System.out.print("TEST 7: ");
        PhoneBook book1 = new PhoneBook();
        book1.add(89263055971L,"О'Генри",true);
        book1.add(89263055972L,"О'Генри",true);
        System.out.println(book1.find("Бальзак"));
    }

}
