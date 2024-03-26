package ru.otus.kiseleva.homeworks.lesson14.exception;

public class AppArrayDataException extends Exception {
    public AppArrayDataException(int rowIndex, int columnIndex, Object value) {
        super("Преобразование в ячейке с индексом (" + rowIndex + "," + columnIndex + ") невозможно. Передано некорректное " +
                "значение " + value);
    }

}
