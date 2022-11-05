package pwo.lab09.adapter;

public class _run {

    public static void main(String[] args) {

        CircleD circleD = new CircleD(2);

        System.out.println("Pole=" + Utils.circAreaR(new Adapter(circleD)));
    }
}