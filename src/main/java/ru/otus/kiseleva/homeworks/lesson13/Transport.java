package ru.otus.kiseleva.homeworks.lesson13;

public class Transport{

    //объем доступного топлива, сил и др ресурсов, за счет которых происходит движение
    double limit;

    //расход топлива л/км, сил, др ресурсов, за счет которых происходит движение
    double rate;

    public Transport(double limit, double rate) {
        this.limit = limit;
        this.rate = rate;
    }


}
