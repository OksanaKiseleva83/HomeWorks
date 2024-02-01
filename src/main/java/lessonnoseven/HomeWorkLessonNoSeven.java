package lessonnoseven;

public class HomeWorkLessonNoSeven {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[][] myArraySourceZero = {{3,-1,0},{6,0,7},{10,-11,12,57},{10,4,-7}};
        int[][] myArraySourceOne = {{0,-1,0},{0,0,0},{0,-11,0,0},{0,0,-7}};
        int[][] myArraySourceSecond = {{-1,-1,-5},{-2,-1,-4},{-3,-11,-1,-2},{-4,-1,-7}};
        System.out.println(sumOfPositiveElements(myArraySourceZero));
        System.out.println(sumOfPositiveElements(myArraySourceOne));
        System.out.println(sumOfPositiveElements(myArraySourceSecond));

        System.out.println("\nЗадание 2");
        printMatrix(3);
        System.out.println();
        printMatrix(1);
        System.out.println();
        printMatrix(7);
        printMatrix(-3);
        printMatrix(0);

        System.out.println("\nЗадание 3");
        //создаем квадратный массив заданной размерности
        int[][] array = createSquareArray(7);
        // обнуляем диагонали
        putZeroOnDiagonalOfArray(array);
        // вывод в консоль полученного результата
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗадание 4");
        int[][] zero = {{3,-1,0},{6,0,7},{10,-11,12,57},{10,4,-7}};
        int[][] one = {{0,-1,0},{0,0,0},{0,-11,0,0},{0,0,-7}};
        int[][] two = {{-1,-1,-5},{-2,-1,-4},{-3,-11,-1,-2},{-4,-1,-7}};
        int[][] three = {{0,0,0},{0,0,0},{0,0,0,0}};
        int[][] four = {{0,7,0}};
        System.out.println(findMax(zero));
        System.out.println(findMax(one));
        System.out.println(findMax(two));
        System.out.println(findMax(three));
        System.out.println(findMax(four));
        System.out.println("\nЗадание 5");
        System.out.println(sumElementsOfSecondStringArrayInt(zero));
        System.out.println(sumElementsOfSecondStringArrayInt(one));
        System.out.println(sumElementsOfSecondStringArrayInt(two));
        System.out.println(sumElementsOfSecondStringArrayInt(three));
        System.out.println(sumElementsOfSecondStringArrayInt(four));
    }

    /**
     * 1) Реализовать метод sumOfPositiveElements(..),
     * принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
     * @param arraySource целочисленный двумерный массив
     */
    public static int sumOfPositiveElements(int[][] arraySource){
        int sum = 0;
        for(int i=0; i<arraySource.length; i++){
            for(int j=0; j<arraySource[i].length; j++){
                if(arraySource[i][j]>0){
                    sum += arraySource[i][j];
                }
            }
        }
        if(sum==0) System.out.print("В массиве нет элементов > 0. Результат: ");
        return sum;
    }

    /**
     * Реализовать метод, который принимает в качестве аргумента int size
     * и печатает в консоль квадрат из символов * со сторонами соответствующей длины;
     * @param size - размерность создаваемой матрицы
     */
    public static void printMatrix(int size){
        if(size>0) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else System.out.println("Задан некорректный размер " + size);
    }

    /**
     * Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
     * зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
     * Проверять количество строк и столбцов не требуется, условие “квадратности” нужно чтобы упростить вам
     * работу с диагоналями;
     * @param arraySource
     */
    public static void putZeroOnDiagonalOfArray(int[][] arraySource){
        for (int i=0; i<arraySource.length; i++){
            for(int j=0; j<arraySource[i].length; j++){
                if(j==i){
                    arraySource[i][j]=0;
                }
            }
            for(int x=arraySource[i].length-1; x>0; x--){
                if(x==(arraySource[i].length-1)-i){
                    arraySource[i][x]=0;
                }
            }
        }
    }

    /**
     * создает двумерный квадратный массив заданной размерности
     * @param size - требуемая размерность массива
     * @return результирующий массив
     */
    public static int[][] createSquareArray(int size){
        if(size>0) {
            int[][] matrix = new int[size][size];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = size;
                }
            }
            return matrix;
        } else {
            System.out.println("Задан некорректный размер " + size);
            return new int[0][0];
        }
    }

    /**
     * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
     * @param array
     * @return
     */
    public static int findMax(int[][] array){
        int max=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(j==0){
                    max=array[i][j];
                }else{
                    if(array[i][j] > max){
                        max = array[i][j];
                    }
                }
            }
        }
        return max;
    }

    /**
     * Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по
     * вашему выбору), если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
     * NB! Релизация для строк. Вторая строка -> индекс массива = 1
     * @param arraySource
     * @return
     */
    public static int sumElementsOfSecondStringArrayInt(int[][] arraySource){
        int sum = 0;
        if(arraySource.length > 1){
            for (int i = 0; i < arraySource.length; i++) {
                if (i == 1) {
                    for (int j = 0; j < arraySource[0].length; j++) {
                        sum += arraySource[i][j];
                    }
                }
            }
            return sum;
        } else return -1;
    }

}
