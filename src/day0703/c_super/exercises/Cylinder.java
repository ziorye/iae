package day0703.c_super.exercises;

public class Cylinder extends Circle {
    // 高
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // 求圆柱的体积
    public double findVolume() {
        // return findArea() * getLength();
        // return 3.14 * getRadius() * getRadius() * getLength();
        return super.findArea() * getLength();
    }

    // 求表面积
    public double findArea() {
        /*
        2 * PI * r
         */
        return 3.14 * getRadius() * getRadius() * 2 +
                2 * 3.14 * getRadius() * getLength();
    }
}
