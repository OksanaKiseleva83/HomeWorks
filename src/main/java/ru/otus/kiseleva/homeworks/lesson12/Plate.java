package ru.otus.kiseleva.homeworks.lesson12;

public class Plate {

    //максимальное количество еды
    private int maxCapacity;

    //текущее количество еды
    private int currentCapacity;

    /**
     * При создании тарелки указывается ее объем и она полностью заполняется едой
     *
     * @param capacity
     */
    public Plate(int capacity) {
        this.maxCapacity = capacity;
        this.currentCapacity = capacity;
    }

    /**
     * В тарелке должен быть метод, позволяющий добавить еду в тарелку.
     * После добавления в тарелке не может оказаться еды больше максимума
     */
    public void add(int issue) {
        if (issue > maxCapacity || maxCapacity < 0) return;
        if ((currentCapacity + issue) <= maxCapacity) {
            currentCapacity += issue;
        }
    }

    /**
     * В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения,
     * - в тарелке не может оказаться отрицательное количество еды
     * (если удалось уменьшить еду так, чтобы в тарелке осталось >= 0 кусков еды, то возвращаем true,
     * в противном случае - false)
     *
     * @return
     */
    public boolean remove(int issue) {
        //if (issue > maxCapacity || maxCapacity < 0) return false;
        if (issue > maxCapacity) return false;
        if (currentCapacity >= issue && issue > 0) {
            currentCapacity -= issue;
            return true;
        } else return false;
    }

}
