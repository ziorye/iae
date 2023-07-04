package day0530;

/**
 * 如何获取一个随机数?
 *
 * 1. 可以使用Java提供的API，Math类的random方法
 * 2. random()会返回一个[0.0, 1.0)的double型随机数
 *
 * 3. 需求1：获取一个[0, 100]范围的随机整数？
 *    需求2：获取一个[1, 100]范围的随机整数？
 *
 * 4. 需求：获取一个[a, b]范围的随机整数？
 *    (int)(Math.random() * (b - a + 1)) + a
 *
 */
public class Random {
    public static void main(String[] args) {
        random1();
        random2();
        random3();
    }

    private static void random1() {
        double d1 = Math.random();
        System.out.println("d1 = " + d1);
    }

    private static void random2() {
        int num1 = (int)(Math.random() * 101);  //[0.0, 1.0) --> [0.0, 101.0) --> [0, 100]
        System.out.println("num1 = " + num1);
    }

    private static void random3() {
        int num2 = (int)(Math.random() * 100) + 1; //[0.0,1.0) --> [0.0,100.0) --->[0, 99] ---> [1,100]
        System.out.println("num2 = " + num2);
    }
}
