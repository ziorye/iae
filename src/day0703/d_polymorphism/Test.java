package day0703.d_polymorphism;

public class Test {
    public static void main(String[] args) {
        // normal
        Person person = new Person();
        person.eat();
        Student student = new Student();
        student.eat();
        Teacher teacher = new Teacher();
        teacher.eat();

        System.out.println("=== === ===");

        // polymorphism
        Person p1 = new Student();
        p1.eat();
        Person p2 = new Teacher();
        p2.eat();
    }
}
