package day0704.g.singleton;

public class Person {
    private Person() {
    }

    // state
    private static final Person PERSON = new Person();

    // behavior
    public static Person getPerson() {
        return PERSON;
    }
}
