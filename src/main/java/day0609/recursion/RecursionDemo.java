package day0609.recursion;

import java.util.Arrays;

public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo rd = new RecursionDemo();

        // m c m
        //rd.mm();

        // 1 + 2 + ... + 100
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("=== === ===");
        // for
        // r
        // 1 + 2 + ... + 100
        // 1 1
        // 1 + 2:
        // sum(1) 1
        // sum(2) sum(2-1) + 2
        // sum(n) sum(n-1) + n

        //System.out.println(rd.f(100));

        // n-factorial

        // Fibonacci
        rd.f(12);
    }

    /*
     * 斐波那契数列 Fibonacci
     * 1  1  2    3   5   8   13  21  34  55  ...
     *
     * f(n) = f(n - 1) + f(n - 2)
     * */
    public int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    /*
     * 计算 n!
     * n-factorial
     * */
    public int nf(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * nf(n - 1);
        }
    }

//    private int f(int i) {
//        if (i == 1) {
//           return 1;
//        } else {
//            return f(i - 1) + i;
//        }
//    }

    /*
     * 斐波那契数列 Fibonacci
     * 1  1  2    3   5   8   13  21  34  55  ...
     *
     * f(n) = f(n - 1) + f(n - 2)
     * */
    /*
    public int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
     */

    /*
     * 计算 n!
     * n-factorial
     * */
    /*
    public int nf(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * nf(n - 1);
        }
    }
     */

    /*
    public int sumR(int num) {
        if (num == 1) {
            return 1;
        } else {
            return sumR(num - 1) + num;
        }

    }
     */

    /*
    public int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
     */

    /**
     * m call m
     */
    public void mm() {
        System.out.println("RecursionDemo.mm");
        mm();
    }
}
