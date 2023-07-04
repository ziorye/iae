package day0608.constructure;

public class Test {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();
        System.out.println(student1);
        System.out.println(student2);
    }
}

class Student {
    String id;
    String name;
    int age;

    static Student student;

    private Student () {}

    public static Student getInstance() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
}
