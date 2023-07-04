package day0609.thiskeyword;

public class ThisDemo {
    public static void main(String[] args) {
        // class Person
        // state behavior
        // constructor this()

        Person person = new Person();
    }
}

class Person {
    // state 成员之一
    String name;
    int age;

    // constructor 成员之三 构造方法、构造器
    public Person () {
        // 20行判断代码
    }

    public Person (String name) {
        this();
        this.name = name;
        // 80代码
    }

    public Person (String name, int age) {
        this(name);
        this.age = age;
    }

    // behavior 成员二
    public void method1() {
        System.out.println("----");
    }
}
