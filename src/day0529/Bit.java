package day0529;

/**
 * Operators 5: Bit Operators
 *              Bitwise and Bit Shift Operators
 *
 * << >> >>>
 *
 * & | ^
 * ~
 *
 * operands: number
 * << *2
 * >> /2
 */
public class Bit {
    public static void main(String[] args) {
        // <<
        int i = 15;
        //i = -15;
        System.out.println("i << 2 = " + (i << 2));
        System.out.println("i << 3 = " + (i << 3));
        System.out.println("i << 28 = " + (i << 28));
        System.out.println("=== === ===");

        // >>
        i = 20;
        System.out.println("i >> 2 = " + (i >> 2));
        System.out.println("i >>> 2 = " + (i >>> 2));
        System.out.println("=== === ===");

        // &、｜、^
        /*
        画图
         */
        int m = 12;
        int n = 5;
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));
        System.out.println("=== === ===");

        System.out.println("~6 = " + ~6);
    }
}
