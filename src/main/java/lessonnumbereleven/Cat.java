package lessonnumbereleven;

public class Cat extends Animal{

    public Cat(String name, int speedRunning, int speedSwimming, int endurance, String type) {
        super(name, speedRunning, speedSwimming, endurance, type);
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кот не умеет плавать!");
        return -1;
    }

    @Override
    public String toString() {
        return "Cat\nname: " + getName() + "\nspeedRunning: " + getSpeedRunning() +
                "\nspeedSwimming: " + getSpeedSwimming() + "\nendurance: " + getEndurance() + "\ntype: " + getType();
    }

}
