package day0607.exercises.state;

/**
 * Exercises 1
 *
 * 面向对象思维练习
 *
 * 写一个学生类。包含3个state：学号id、姓名name、年龄age
 * 写一个学生测试类。实例化(new)出两个学生，为其state赋值，同时输出两个学生信息
 *
 * 预期输出
 *   学生(**学号)的信息：学号=**、姓名=**、年龄=**
 */
public class Student {
    // state
    String id;
    String name;
    int age;
    Dog[] dogs;

    // behavior
    public void show() {
        System.out.println("学生(" + id + ")的信息：学号=" + id + "、姓名=" + name + "、年龄=" + age);
        showDogs();
    }

    public void showDogs() {
        System.out.println("有" + dogs.length + "只狗狗：");
        for (Dog dog : dogs) {
            dog.show();
        }
    }
}
