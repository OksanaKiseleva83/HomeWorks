package ru.otus.kiseleva.homeworks.lesson15.exception;

public class AppArrayRangeException extends Exception {
    public AppArrayRangeException(int min, int max) {
        super("В качестве аргумента передан массив некорректного диапазона [" + min + "," + max + "]");
    }

}
