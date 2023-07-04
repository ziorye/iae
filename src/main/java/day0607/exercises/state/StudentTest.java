package day0607.exercises.state;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = "编号89757";
        student.name = "小高";
        student.age = 18;
        // new 1 dog
        // dogs Dog[]

        Dog[] dogs = new Dog[1];

        Dog dog = new Dog();
        dog.id = "123";
        dog.name = "D1";
        dog.color = "黑";

        dogs[0] = dog;


        student.dogs = dogs;

        student.show();

        // === === ===

        Student student1 = new Student();
        student1.id = "9876543";
        student1.name = "小红";
        student1.age = 18;

        // new 2 dogs
        //Dog[]
        Dog[] ds = null;

        Dog d1 = new Dog();
        d1.id = "d100";
        d1.name = "d-abc";
        d1.color = "black";

        Dog d2 = new Dog();
        d2.id = "d200";
        d2.name = "d-uuui";
        d2.color = "red";

        ds = new Dog[2];
        ds[0] = d1;
        ds[1] = d2;

        student1.dogs = ds;

        student1.show();
    }
}
