package day0529;

/**
 * Operators 6: Ternary Operators
 *              if-then-else statement
 *
 * someCondition ? value1 : value2;
 *
 * someCondition: boolean
 * result type? value1 or value2
 */
public class Ternary {
    public static void main(String[] args) {
        // 2 number, which max?
        int m = 12;
        int n = 5;

        int max = (m > n) ? m : n;
        System.out.println(max);

        double num = (m > n) ? 2 : 1.0;

        // (m > n)? 2 : "n大";

        // === === ===
        n = 12;
        String maxStr = (m > n) ? "m大" : ((m == n) ? "m和n相等" : "n大");
        System.out.println(maxStr);

        // === === ===
        // 3 number, which max?
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println("三个数中的最大值为：" + max2);

        int max3 = (((n1 > n2)? n1 : n2) > n3)? ((n1 > n2)? n1 : n2) : n3;
        System.out.println("三个数中的最大值为：" + max3);
    }
}
