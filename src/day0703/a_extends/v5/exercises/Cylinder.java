package day0703.a_extends.v5.exercises;

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
//        return 3.14 * getRadius() * getRadius() * getLength();
        return findArea() * getLength();
    }
}
