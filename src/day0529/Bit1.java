package day0529;

public class Bit1 {
    public static void main(String[] args) {
        // 高效方式计算 2 * 8
        // todo

        // 交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        // 方式一：临时变量
        /*
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
         */

        // 方式二：和、差
        /*
        备注：不用定义临时变量、相加操作可能超出存储范围、只能适用于数值类型
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
         */


        // 方式三：^
        /*
        备注：只能适用于数值类型
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
         */
    }
}
