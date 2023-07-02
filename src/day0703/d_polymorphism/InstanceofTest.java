package day0703.d_polymorphism;

public class InstanceofTest {
    public static void main(String[] args) {
        Person p1 = new Student();
        // 不能直接调用子类特有的结构
//        p1.study();
//        System.out.println(p1.school);

        // 向下转型：使用强转符。
        Student s1 = (Student) p1;
        s1.study();
        System.out.println(s1.school);

        System.out.println(p1 == s1);

        /*
        向下转型可能会出现：类型转换异常（java.lang.ClassCastException）
         */
        Person p2 = new Teacher();
        Student s2 = (Student) p2;
        s2.study();

        /*
        为了代码的健壮性，在向下转型之前应该用 instanceof 进行判断，避免出现类型转换异常
        格式：a instanceof A : 判断对象a是否是类A的实例
        如果：a instanceOf A 返回 true，则：
             a instanceOf superA 返回也是true。其中：A 是 superA 的子类
         */
        if (p2 instanceof Student) {
            Student s3 = (Student) p2;
            s3.study();
        }

        if (p2 instanceof Teacher) {
            System.out.println("p2 instanceof Teacher");
        }

        if (p2 instanceof Person) {
            System.out.println("p2 instanceof Person");
        }
        if (p2 instanceof Object) {
            System.out.println("p2 instanceof Object");
        }
    }
}
