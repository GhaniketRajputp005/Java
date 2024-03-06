// import java.util.*;

class Cylinder {
    private int radius;
    private int height;

    Cylinder(int x, int y) {
        radius = x;
        height = y;
    }

    void getValue() {
        System.out.println(radius + " " + height);
    }

    double volume() {
        return 3.14 * radius * radius * height;
    }
}

public class MyMain {
    public static void main(String[] args) {

        Cylinder obj = new Cylinder(12, 12);
        // obj.setValue(12, 12);
        obj.getValue();
        double val = obj.volume();
        System.out.println(val);

    }

}
