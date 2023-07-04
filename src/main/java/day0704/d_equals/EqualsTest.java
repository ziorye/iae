package day0704.d_equals;

import java.io.File;
import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {
        User u1 = new User("Andy", 18);
        User u2 = new User("Andy", 18);

        System.out.println(u1.equals(u2));
        System.out.println(u1 == u2);

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String filePath = "file.txt";
        File file1 = new File(filePath);
        File file2 = new File(filePath);
        System.out.println(file1.equals(file2));

        int[] arr = new int[10];
        System.out.println(arr.equals(new int[10]));
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

    //重写equals():手动实现
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if(obj instanceof User){
//            User user = (User)obj;
//            //方式1：
////            if(this.age == user.age && this.name.equals(user.name)){
////                return true;
////            }else{
////                return false;
////            }
//            return this.age == user.age && this.name.equals(user.name);
//        }
//
//        return false;
//    }

    // IDEA 自动实现
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}
