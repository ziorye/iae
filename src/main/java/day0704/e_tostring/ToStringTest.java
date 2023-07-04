package day0704.e_tostring;

import java.io.File;
import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Andy", 18);
        System.out.println(u1.toString());
        System.out.println(u1);

        String s1 = new String("hello");
        System.out.println(s1.toString());

        File file = new File("file.txt");
        System.out.println(file);

        Date date = new Date();
        System.out.println(date);
    }
}

class User {

    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现toString()
//    @Override
//    public String toString() {
//        return "User{ name = " + name + ", age = " + age + "}";
//
//    }

//    自动生成
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
