package ru.otus.kiseleva.homeworks.lesson14;

import ru.otus.kiseleva.homeworks.lesson14.exception.AppArrayDataException;
import ru.otus.kiseleva.homeworks.lesson14.exception.AppArraySizeException;

public class HomeWorkLessonNo14 {

    public static void main(String[] args) {
        String[][] array0 = {{"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}};
        String[][] array1 = {{"qaz", "wsx", "edc"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}};
        String[][] array2 = {{"qaz", "wsx", "edc", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}};
        String[][] array3 = {{"qaz", "wsx", "edc", "edc"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}, {"qaz", "wsx", "edc", "rfv"}};
        String[][] array4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "0", "1", "2"}, {"3", "4", "5", "6"}};
        //1)
        try {
            checkArraySize(array0);
//            checkArraySize(array1);
//            checkArraySize(array2);
//            checkArraySize(array3);
            System.out.println("Проверка размера массива завершилась успешно!");
        } catch (AppArraySizeException e) {
            System.out.println("Перехват AppArraySizeException с выходом из программы!");
            System.out.println(e.getMessage());
        }
        //2)
        try{
            System.out.println();
            System.out.println("Сумма элементов массива равна " + getSumOfArrayElements(array0));
            //System.out.println("Сумма элементов массива равна " + getSumOfArrayElements(array4));
        }catch(AppArrayDataException e){
            System.out.println("Перехват AppArrayDataException с выходом из программы!");
            System.out.println(e.getMessage());
        }
    }


    /**
     * 1) Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
     * Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
     * <p>
     * 2) Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
     * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
     * должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные
     * 3) В методе main() необходимо вызвать полученный метод, обработать возможные исключения
     * AppArraySizeException и AppArrayDataException и вывести результат расчета
     * (сумму элементов, при условии что подали на вход корректный массив).
     */
    public static int getSumOfArrayElements(String[][] source) throws AppArrayDataException {
        int summary = 0;
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                if (source[i][j].matches("([0-9]+)")) {
                    summary += Integer.valueOf(source[i][j]);
                } else {
                    throw new AppArrayDataException(i, i, source[i][j]);
                }
            }
        }
        return summary;
    }

    public static void checkArraySize(String[][] source) throws AppArraySizeException {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                if (source.length != 4 || source[i].length != 4) {
                    throw new AppArraySizeException(source.length, source[i].length);
                }
            }
        }
    }
}
