package day0703.a_extends.v2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.play();

        Student student = new Student();
        student.eat();
        student.play();
        student.study();
    }
}
