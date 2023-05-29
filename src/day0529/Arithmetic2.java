package day0529;

import java.util.Scanner;

public class Arithmetic2 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();*/

        int num = 187;

        /*
        int hundreds = num / 100;
        // int tens = num / 10 % 10;
        int tens = num % 100 / 10;
        int units = num % 10;
         */
        int hundreds = num / 100;
        //int tens = num % 100 / 10;
        int tens = num / 10 % 10;
        int units = num % 10;

        System.out.println("百位为：" + hundreds);
        System.out.println("十位为：" + tens);
        System.out.println("个位为：" + units);
    }
}
