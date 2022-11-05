
package pwo.lab09.adapter;

public class Adapter implements Utils.CircleR {
    private double r;

    public Adapter(CircleD circleD) {
        r = circleD.getD() / 2;
    }

    @Override
    public double getR() {
        return r;
    }
}