package ru.otus.kiseleva.homeworks.lesson13;

public class MainTest {
    public static void main(String[] args) {
        Car car = new Car(100, 0.093);
        CrossCountry cross = new CrossCountry(100, 0.093);
        Human gandalf = new Human("Гэндальф");
        gandalf.reachTo(100, Terrain.WOOD);
        Human mrBean = new Human("мистер Бин");
        mrBean.getOn(car);
        mrBean.reachTo(100, Terrain.SWAMP);
        mrBean.reachTo(100, Terrain.PLAIN);
        mrBean.reachTo(100, Terrain.PLAIN);
        mrBean.reachTo(-100, Terrain.PLAIN);
        Human walker = new Human("крутой Уокер");
        walker.reachTo(100, Terrain.SWAMP);
        walker.reachTo(100, Terrain.PLAIN);
        walker.reachTo(100, Terrain.PLAIN);
        walker.getOn(cross);
        walker.reachTo(100, Terrain.SWAMP);
        walker.reachTo(100, Terrain.PLAIN);
        walker.reachTo(1000, Terrain.PLAIN);
        walker.reachTo(-1000, Terrain.PLAIN);
        Car perpetuumMobile = new Car(0, 0.1);
        Human strauss = new Human("Штраус");
        strauss.reachTo(100, Terrain.SWAMP);
        strauss.getOn(perpetuumMobile);
        strauss.reachTo(1, Terrain.PLAIN);
        Horse horse = new Horse(150,0.08);
        strauss.getOn(horse);
        strauss.getOff();
        strauss.getOn(horse);
        strauss.reachTo(1000, Terrain.SWAMP);
        strauss.reachTo(1000, Terrain.WOOD);
        strauss.reachTo(100, Terrain.PLAIN);
        strauss.reachTo(1000, Terrain.PLAIN);
        strauss.reachTo(-1000, Terrain.PLAIN);
        Bicycle soul = new Bicycle();
        strauss.getOn(soul);
        strauss.getOff();
        strauss.getOn(soul);
        strauss.reachTo(1000, Terrain.PLAIN);
        strauss.reachTo(700, Terrain.WOOD);
        strauss.reachTo(-700, Terrain.SWAMP);
    }
}
