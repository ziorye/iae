package day0703.d_polymorphism;

public class Teacher extends Person {
    @Override
    void eat() {
        System.out.println("Teacher.eat");
    }

    @Override
    void play() {
        System.out.println("Teacher.play");
    }
}
