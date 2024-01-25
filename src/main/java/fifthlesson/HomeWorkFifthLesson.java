package fifthlesson;

public class HomeWorkFifthLesson {

    public static void main(String[] args) {
        // 1)
        printStringNumberOfTimes("Hello World!", 3);

        // 2)
        int[] arraySourceOne = {10,1,0,4,5,7,8,10,100};
        printSumElementOfArray(arraySourceOne);
        int[] arraySourceSecond = {0,0,0,0,0,0,0,0,0};
        printSumElementOfArray(arraySourceSecond);

        //3)
        int[] source = new int[7];
        putValueToArray(source,7);

        //4)
        int[] array = {1,0,11,7,4,2,9};
        incrementElementOfArray(array,-3);
        incrementElementOfArray(array,3);

        //5)
        int[] array1 = {1, 0, 11, 7, 4, 2, 9};
        researchSum(array1);
        int[] array2 = {1, 0, 11, 7, 4, 2, 9, 7};
        researchSum(array2);
        int[] array3 = {1, 0, 11, 7, 4, 2, 9, 100};
        researchSum(array3);
        int[] array4 = {0, 0, 0, 0, 0, 0, 0, 0};
        researchSum(array4);


    }

    // 1 Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    // и печатающий в консоль строку указанное количество раз
    public static void printStringNumberOfTimes(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
        /*for (int i=number; i>0; i--){
            System.out.println(str);
        }*/
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    //суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
    public static void printSumElementOfArray(int[] arraySource) {
        int summary = 0;
        for (int i : arraySource) {
            if (i > 5) summary += i;
        }
        System.out.println(summary);
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // метод должен заполниться каждую ячейку массива указанным числом.
    public static void putValueToArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    // увеличивающий каждый элемент которого на указанное число.
    public static void incrementElementOfArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] += value;
        }
    }

    //Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль сумма элементов какой из половин массива больше
    public static void researchSum(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                sumLeft += array[i];
            }
            for (int y = array.length - 1; y > array.length / 2; y--) {
                sumRight += array[y];
            }
            if (sumLeft > sumRight) {
                System.out.println("Сумма левой половины массива больше суммы правой");
            } else {
                if (sumLeft == sumRight) {
                    System.out.println("Суммы половин равны между собой");
                } else {
                    System.out.println("Сумма правой половины массива больше суммы левой");
                }
            }
        } else System.out.println("Массив нельзя поделить на равные по количеству элементов половины");

    }


}
