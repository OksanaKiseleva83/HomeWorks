package lessonnumbereleven;

public class Dog extends Animal {

    public Dog(String name, int speedRunning, int speedSwimming, int endurance, String type) {
        super(name, speedRunning, speedSwimming, endurance,type);
    }

    @Override
    public int swim(int distance) {
        setEndurance(getEndurance() - 2 * distance);
        if (getEndurance() >= 0) {
            return distance / getSpeedSwimming();
        }else{
            System.out.println("У " + getType() + " появилось состояние усталости");
            return  -1;
        }
    }

    @Override
    public String toString() {
        return "Dog\nname: " + getName() + "\nspeedRunning: " + getSpeedRunning() +
                "\nspeedSwimming: " + getSpeedSwimming() + "\nendurance: " + getEndurance() + "\ntype: " + getType();
    }

}
