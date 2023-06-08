package day0607.exercises.e1;

public class Person {
    // state
    String name;
    int age;
    char gender;

    // behavior
    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        return age;
    }

    public void addAge(int addAge) {
        age += addAge;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.study();

        System.out.println(person.showAge());

        person.addAge(5);
        System.out.println(person.showAge());
    }
}
