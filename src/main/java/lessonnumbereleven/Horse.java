package lessonnumbereleven;

public class Horse extends Animal{

    public Horse(String name, int speedRunning, int speedSwimming, int endurance, String type) {
        super(name, speedRunning, speedSwimming, endurance, type);
    }

    @Override
    public int swim(int distance) {
        setEndurance(getEndurance() - 4 * distance);
        if (getEndurance() >= 0) {
            return distance / getSpeedSwimming();
        }else{
            System.out.println("У " + getType() + " появилось состояние усталости!");
            return  -1;
        }
    }

    @Override
    public String toString() {
        return "Horse\nname: " + getName() + "\nspeedRunning: " + getSpeedRunning() +
                "\nspeedSwimming: " + getSpeedSwimming() + "\nendurance: " + getEndurance() + "\ntype: " + getType();
    }

}
