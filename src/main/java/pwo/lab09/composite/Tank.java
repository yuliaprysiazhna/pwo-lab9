package pwo.lab09.composite;

public class Tank extends WaterSystem {

    boolean full = false;

    @Override
    public void fill() {
        super.fill();
        System.out.println("Zamykam odpływ");
    }

    @Override
    public void afterFill() {
        super.afterFill();
        full = true;
    }

    @Override
    public void drain() {
        super.drain();
        System.out.println("Otwieram odpływ");
    }

    @Override
    public void afterDrain() {
        super.afterDrain();
        full = false;
    }
}