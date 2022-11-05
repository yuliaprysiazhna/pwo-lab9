package pwo.lab09.composite;

public class Tap extends WaterSystem {

    @Override
    public void fill() {
        super.fill();

        System.out.println("Kran odkręcony");
    }

    @Override
    public void afterFill() {
        super.afterFill();
        System.out.println("Kran zakręcony");
    }

    @Override
    public void drain() {
        super.drain();
    }

    @Override
    public void afterDrain() {
        super.afterDrain();
    }
}