package day0703.a_extends.v3;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.play();
        //System.out.println(person.name);

        Student student = new Student();
        student.eat();
        student.play();
        student.study();
        //System.out.println(student.name);
    }
}
