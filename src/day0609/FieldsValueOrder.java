package day0609;

/**
 * 一、类中属性（当前仅考虑实例变量）赋值过程：
 *
 * 1. 在类的属性中，可以有哪些位置给属性赋值？
 * ① 默认初始化；
 * ② 显式初始化；
 * ③ 构造器中初始化；
 * === === ===
 * ④ 通过"对象.方法"的方式赋值；
 * ⑤ 通过"对象.属性"的方式赋值；
 *
 * 2. 这些位置执行的先后顺序是怎样？
 * ① - ② - ③ - ④/⑤
 *
 *
 * 3. 以上操作在对象创建过程中可以执行的次数如何？
 * 只能执行一次：①、②、③
 * 可以多次执行：④、⑤
 */
public class FieldsValueOrder {
    public static void main(String[] args) {
        User u1 = new User();

        System.out.println(u1.age);

        User u2 = new User(2);
        System.out.println(u2.age);
        u2.age = 3;
        u2.age = 4;
    }
}

class User{
    // state field instance var
    //属性(或实例变量)
    String name;
    int age = 10;

    public User(){
        this.age = 20;
    }

    public User(int a){
        age = a;
    }

}
