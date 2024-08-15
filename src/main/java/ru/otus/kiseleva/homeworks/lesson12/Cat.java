package ru.otus.kiseleva.homeworks.lesson12;

public class Cat {

    private String name;

    private int appetite;

    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    /**
     * Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
     * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
     *
     * @param plate
     */
    public void eat(Plate plate) {
        fullness = plate.remove(appetite);
    }

    /**
     * вывод информации о сытости кота в консоль
     */
    public void info() {
        if (appetite <= 0) {
            System.out.println(String.format("Кот %s имеет неопределенный аппетит. Сытость не может быть рассчитана", name));
        } else {
            if (fullness) {
                System.out.println(String.format("Кот %s сытый", name));
            } else {
                System.out.println(String.format("Кот %s голоден", name));
            }
        }
    }

}
