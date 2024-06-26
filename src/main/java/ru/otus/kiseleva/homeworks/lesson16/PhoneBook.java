package ru.otus.kiseleva.homeworks.lesson16;

import java.util.HashMap;
import java.util.Map.*;
import java.util.Set;

/**
 * Описание/Пошаговая инструкция выполнения домашнего задания:
 * 1) Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
 * 2) Метод add() должен позволять добавлять запись имя-телефон;
 * 3) Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
 * 4) Под одним именем может быть несколько телефонов
 * (в случае однофамильцев, или наличии у одного человека нескольких номеров), тогда при запросе такой фамилии должны выводиться все телефоны;
 * 5) Метод containsPhoneNumber должен проверять наличие телефона в справочнике.
 */
public class PhoneBook {

    private HashMap<Long, String> mappingNameAndPhone = new HashMap<>();

    public HashMap<Long, String> getMappingNameAndPhone() {
        return this.mappingNameAndPhone;
    }

    /**
     * позволяет добавлять запись имя-телефон
     * @param number
     * @param name
     * @param replaceFlag - игнорируется, если ключа нет в коллекции
     */
    public void add(Long number, String name,boolean replaceFlag) {
        if (containsPhoneNumber(number)) {
            mappingNameAndPhone.put(number, name);
        } else{
            if(replaceFlag) mappingNameAndPhone.put(number, name);
        }
    }

    /**
     * проверяет наличие телефона в справочнике
     *
     * @param number - номер телефона
     * @return
     */
    public boolean containsPhoneNumber(Long number) {
        return !mappingNameAndPhone.containsKey(number);
    }

    /**
     * выполняет поиск номер(-а, -ов) телефона по имени
     *
     * @param name
     */
    public HashMap<Long, String> find(String name) {
        HashMap<Long, String> result = new HashMap<>();
        for (Entry<Long, String> entry : mappingNameAndPhone.entrySet()) {
            if (entry.getValue().equals(name)) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        if(result.isEmpty()) System.out.print("По указанному имени номер(а/ов) в телефонной книге нет! ");
        return result;
    }

}
