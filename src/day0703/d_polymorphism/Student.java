package day0703.d_polymorphism;

public class Student extends Person {
    @Override
    void eat() {
        System.out.println("Student.eat");
    }

    @Override
    void play() {
        System.out.println("Student.play");
    }
}
