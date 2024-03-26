package ru.otus.kiseleva.homeworks.lesson14.exception;

public class AppArraySizeException extends Exception {
    public AppArraySizeException(int rowLength, int columnLength) {
        super("В качестве аргумента передан массив некорректного размера [" + rowLength + "][" + columnLength + "]");
    }

}
