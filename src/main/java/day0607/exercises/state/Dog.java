package day0607.exercises.state;

/**
 * Exercises 2
 *
 * 面向对象思维练习
 *
 * 写一个狗Dog类。包含三个state：编号id、名称name、颜色color
 * 写一个狗Dog测试类。实例化(new)出两只狗，为其state赋值，同时输出两只狗信息
 *
 * 预期输出
 *   狗(**编号)的信息：编号=**、名称=**、颜色=**
 */
public class Dog {
    // state field属性 variable变量
    String id;
    String name;
    String color;

    // behavior
    public void show() {
        System.out.println("狗(" + id + "编号)的信息：编号=" + id + "、名称=" + name + "、颜色=" + color);
    }
}
