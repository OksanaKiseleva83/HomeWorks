package ru.otus.kiseleva.homeworks.lesson15.exception;

public class AppArgumentException extends Exception {
    public AppArgumentException(int value){
        super("В качестве аргумента передано некорректное значение " + value);
    }

}
