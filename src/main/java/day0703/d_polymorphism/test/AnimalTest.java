package day0703.d_polymorphism.test;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal) {
        /*
        Animal animal = new Dog()
         */
        animal.eat();
        animal.jump();

//        animal.watchDoor();
    }

//    public void adopt(Dog dog){
//        dog.eat();
//        dog.jump();
//
//    }
//
//    public void adopt(Cat cat){
//        cat.eat();
//        cat.jump();
//
//    }

    // ...
}

class Animal {
    public void eat() {
        System.out.println("Animal.eat");
    }

    public void jump() {
        System.out.println("Animal.jump");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog.eat");
    }

    public void jump() {
        System.out.println("Dog.jump");
    }

    public void watchDoor() {
        System.out.println("Dog.watchDoor");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat.eat");
    }

    public void jump() {
        System.out.println("Cat.jump");
    }

    public void catchMouse() {
        System.out.println("Cat.catchMouse");
    }
}

