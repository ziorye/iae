package day0530;

import java.util.Scanner;

/**
 * 题目：
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */
public class ForWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数

        while (true) {
            int number = scan.nextInt();
            //判断number的正负情况
            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                /*
                command + click
                 */
                break;
            }
        }

        System.out.println("输入的正数个数为：" + positiveNumber);
        System.out.println("输入的负数个数为：" + negativeNumber);
    }
}
