package ru.otus.kiseleva.homeworks.lesson19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

/**
 * Описание/Пошаговая инструкция выполнения домашнего задания:
 * Реализуйте приложение, позволяющее работать с текстовыми файлами
 * При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
 * Далее программа запрашивает имя файла, с которым хочет работать пользователь
 * Содержимое файла выводится в консоль
 * Затем любую введенную пользователем строку необходимо записывать в указанный файл
 */
public class WorkWithTextFiles {

    public static void main(String[] args) {
        printListOfFilesCurrentDir();
        System.out.println();
        System.out.println("Введите в консоль имя файла для его просмотра и редактирования или Exit для выхода из программы:");
        Scanner sc = new Scanner(System.in);
        String path = "";
        boolean readyFlag = false;
        path = sc.nextLine();
        while(!readyFlag){
            if(!(path.equals("Exit")||path.equals("exit"))) {
                if(fileIsExists(path)) {
                    System.out.println(String.format("Содержимое файла %s:",path));
                    readingFileByPath(path);
                    readyFlag = true;
                }else path = sc.nextLine();
            }else break;
        }
        if(readyFlag) {
            System.out.println("Введите в консоль данные для записи в указанный файл:");
            String data = sc.nextLine();
            writingToFileByPath(path,data);
        }
    }

    /**
     * При старте приложения, в консоль выводится список текстовых файлов
     * из корневого каталоге проекта
     */
    public static void printListOfFilesCurrentDir() {
        String path = ".\\";
        File fileObj = new File(path);
        if (fileObj.isDirectory() && fileObj.exists()) {
            File[] filesObjList = fileObj.listFiles();
            if(Objects.nonNull(filesObjList)){
                System.out.println("Список текстовых файлов в текущей директории: ");
                for(File issue : filesObjList){
                    if (issue.isFile()) {
                        if(issue.getAbsolutePath().matches(".*xml|.*json|.*txt|.*gitignore")){
                            System.out.println(issue.getName());
                        }
                    }
                }
            }else{
                System.out.println(String.format("Текущая директория %s не содержит файлов/каталогов",fileObj));
            }
        } else {
            System.out.println(path + " не является директорией.");
        }
    }

    /**
     * Проверяет существование файла по указанному пути
     * @param path - путь для файла или маркет выхода из программы Exit/exit
     * @return true - если файл найден, false - иное
     */
    private static boolean fileIsExists(String path){
        File fileObj = new File(path);
        if(fileObj.isFile() && fileObj.exists()){
            System.out.println(String.format("Указанный файл %s существует!",path));
            return true;
        }else{
            if(!path.equals("") && !(path.equals("Exit")||path.equals("exit"))) {
                System.out.println(String.format("Указанного файла %s не существует. Попробуйте еще или наберите Exit для выхода из программы", path));
                return false;
            }else{
                if(path.equals("Exit")||path.equals("exit")) return true;
            }
            return false;
        }
    }

    /**
     * Содержимое файла выводится в консоль
     * @param path
     */
    private static void readingFileByPath(String path){
        try(InputStreamReader in = new InputStreamReader(new FileInputStream(path))){
            int n = in.read();
            while(n != -1){
                System.out.print((char)n);
                n = in.read();
            }
            System.out.println();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Затем любую введенную пользователем строку необходимо записывать в указанный файл
     * @param path
     * @param data
     */
    private static void writingToFileByPath(String path, String data){
        try(FileOutputStream out = new FileOutputStream(path)){
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

}
