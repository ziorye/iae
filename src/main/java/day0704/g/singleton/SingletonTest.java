package day0704.g.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person1 == person2);
    }
}
