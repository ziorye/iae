package day0703.d_polymorphism;

public class Teacher extends Person {
    Long salary;

    @Override
    void eat() {
        System.out.println("Teacher.eat");
    }

    @Override
    void play() {
        System.out.println("Teacher.play");
    }

    void teach() {
        System.out.println("Teacher.teach");
    }
}
