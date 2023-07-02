package day0703.a_extends.v4;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.play();

        Student student = new Student();
        student.eat();
        student.play();
        student.study();

        // 1. person.***、student.***
        // 2. why can use
        // 3. supper class
        /*
        System.out.println(student.getClass().getSuperclass());
        System.out.println(person.getClass().getSuperclass());
         */
        // command + click
    }
}
