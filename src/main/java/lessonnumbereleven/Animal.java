package lessonnumbereleven;

public abstract class Animal {

    private String name;

    private int speedRunning;

    private int speedSwimming;

    private int endurance;

    private String type;

    public Animal(String name, int speedRunning, int speedSwimming, int endurance,String type) {
        this.name = name;
        this.speedRunning = speedRunning;
        this.speedSwimming = speedSwimming;
        this.endurance = endurance;
        this.type=type;
    }

    public int run(int distance) {
        endurance -= distance;
        if (endurance >= 0){
            return distance / getSpeedRunning();
        }else{
            System.out.println("У животного " + getType() + " появилось состояние усталости!");
            return -1;
        }
    }

    public abstract int swim(int distance);

    public void info() {
        System.out.println(this.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedRunning() {
        return speedRunning;
    }

    public void setSpeedRunning(int speedRunning) {
        this.speedRunning = speedRunning;
    }

    public int getSpeedSwimming() {
        return speedSwimming;
    }

    public void setSpeedSwimming(int speedSwimming) {
        this.speedSwimming = speedSwimming;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
