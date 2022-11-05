package pwo.lab09.adapter;

public class Utils {

    public interface CircleR {
        double getR();
    }

    public static double circAreaR(CircleR circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }
}