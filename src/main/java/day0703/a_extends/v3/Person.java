package day0703.a_extends.v3;

public class Person {
    private String name;
    int age;

    void eat() {
        System.out.println("Person.eat");
    }

    void play() {
        System.out.println("Person.play");
    }

    void show() {
        System.out.println("name=" + this.name);
    }
}
