package day0530;

/**
 * 题目：
 * <p>
 * 找出 100 以内所有的质数
 * <p>
 * 质数：只能被1和它本身整除的自然数。比如：2,3,5,7,11,13,17,19,23,....
 * [2, number-1]
 */
public class PrimeNumber {
    public static void main(String[] args) {
        prime1();
        prime2();
    }

    private static void prime1() {
        boolean isPrime = true;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }

            // reset
            isPrime = true;
        }
    }

    private static void prime2() {
        boolean isPrime = true;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }

            // reset
            isPrime = true;
        }
    }
}
