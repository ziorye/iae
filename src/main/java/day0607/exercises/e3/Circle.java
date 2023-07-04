package day0607.exercises.e3;

public class Circle {
    // state
    public double r;

    // behavior
    public void setR(double r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}
