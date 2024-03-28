package ru.otus.kiseleva.homeworks.lesson15;

import ru.otus.kiseleva.homeworks.lesson15.exception.AppArgumentException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkLessonNo15WorkWithEmployee {

    public static void main(String[] args) {
        //2
        List<String> result = getEmployeeNames(Arrays.asList(new Employee(37, "Александр"),
                new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                new Employee(60, "Федор"), new Employee(70, "Давид")));
        System.out.println(result);

        //3
        try {
            List<Employee> employees = getEmployees(Arrays.asList(new Employee(37, "Александр"),
                    new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                    new Employee(60, "Федор"), new Employee(70, "Давид")), 35);
            for (Employee i : employees) {
                System.out.print(i.getName() + " ");
            }
            System.out.println();
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            List<Employee> employees = getEmployees(Arrays.asList(new Employee(37, "Александр"),
                    new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                    new Employee(60, "Федор"), new Employee(70, "Давид")), 0);
            for (Employee i : employees) {
                System.out.print(i.getName() + " ");
            }
            System.out.println();
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            List<Employee> employees = getEmployees(Arrays.asList(new Employee(37, "Александр"),
                    new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                    new Employee(60, "Федор"), new Employee(70, "Давид")), -5);
            for (Employee i : employees) {
                System.out.print(i.getName() + " ");
            }
            System.out.println();
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }

        //4
        try {
            int average = 30;
            System.out.println("Средний возраст сотрудников больше заданного значения " + average + ": " +
                    checkAverageAgeEmployeesThatGreater(Arrays.asList(new Employee(37, "Александр"),
                            new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                            new Employee(60, "Федор"), new Employee(70, "Давид")), average));
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int average = -5;
            System.out.println("Средний возраст сотрудников больше заданного значения " + average + ": " +
                    checkAverageAgeEmployeesThatGreater(Arrays.asList(new Employee(37, "Александр"),
                            new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                            new Employee(60, "Федор"), new Employee(70, "Давид")), average));
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int average = 115;
            System.out.println("Средний возраст сотрудников больше заданного значения " + average + ": " +
                    checkAverageAgeEmployeesThatGreater(Arrays.asList(new Employee(37, "Александр"),
                            new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                            new Employee(60, "Федор"), new Employee(70, "Давид")), average));
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int average = 0;
            System.out.println("Средний возраст сотрудников больше заданного значения " + average + ": " +
                    checkAverageAgeEmployeesThatGreater(Arrays.asList(new Employee(37, "Александр"),
                            new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                            new Employee(60, "Федор"), new Employee(70, "Давид")), average));
        } catch (AppArgumentException e) {
            System.out.println(e.getMessage());
        }
        //5
        List<Employee> test = getYoungestEmployee(Arrays.asList(new Employee(37, "Александр"),
                new Employee(26, "Михаил"), new Employee(30, "Сергей"),
                new Employee(60, "Федор"), new Employee(70, "Давид")));
        for(Employee i : test){
            System.out.println("Минимальный возраст "+ i.getAge() + " лет" + " имеет сотрудник с именем " + i.getName());
        }

        List<Employee> test1 = getYoungestEmployee(Arrays.asList(new Employee(37, "Александр"),
                new Employee(35, "Александр"), new Employee(35, "Николай"),
                new Employee(60, "Федор"), new Employee(70, "Давид")));
        for(Employee i : test1){
            System.out.println("Минимальный возраст "+ i.getAge() + " лет" + " имеет сотрудник с именем " + i.getName());
        }
    }

    /**
     * 2 Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
     * 3 Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
     * и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
     * 4 Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
     * и проверяющий что средний возраст сотрудников превышает указанный аргумент;
     * 5 Реализуйте метод, принимающий в качестве аргумента список сотрудников,
     * и возвращающий ссылку на самого молодого сотрудника.
     */
    public static List<String> getEmployeeNames(List<Employee> staff) {
        List<String> result = new ArrayList<>();
        for (Employee issue : staff) {
            result.add(issue.getName());
        }
        return result;
    }

    /**
     * 3 Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
     * и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
     */
    public static List<Employee> getEmployees(List<Employee> staff, int minAge) throws AppArgumentException {
        if (minAge < 0) throw new AppArgumentException(minAge);
        List<Employee> result = new ArrayList<>();
        for (Employee issue : staff) {
            if (issue.getAge() >= minAge) {
                result.add(issue);
            }
        }
        return result;
    }

    /**
     * 4 Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
     * и проверяющий что средний возраст сотрудников превышает указанный аргумент;
     */
    public static boolean checkAverageAgeEmployeesThatGreater(List<Employee> staff, int average) throws AppArgumentException {
        if (average < 0) throw new AppArgumentException(average);
        int sumAge = 0;
        for (Employee employee : staff) {
            sumAge += employee.getAge();
        }
        return (sumAge / staff.size() > average) ? true : false;
    }

    /**
     * 5 Реализуйте метод, принимающий в качестве аргумента список сотрудников,
     * и возвращающий ссылку на самого молодого сотрудника.
     */
    public static List<Employee> getYoungestEmployee(List<Employee> staff) {
        List<Employee> foreverYoung = new ArrayList<>();
        int reference = staff.get(0).getAge();
        for (Employee employee : staff) {
            if (employee.getAge() < reference) {
                reference = employee.getAge();
                foreverYoung.set(0,employee);
            }else{
                if(employee.getAge() == reference){
                    reference = employee.getAge();
                    foreverYoung.add(employee);
                }
            }
        }
        return foreverYoung;
    }

}
