package day0530;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        System.out.println("欢迎进入猜数字游戏！");
        System.out.println("请输入一个数字：（范围是0-100）");
        Random random = new Random();
        int randomNumber = random.nextInt(101);//随机产生一个小于101的整数
        Scanner scanner = new Scanner(System.in);
        int count = 5;// 猜的次数
        while (count > 0) {
            System.out.println("您有" + count + "次机会！");
            count--;
            System.out.print("请输入猜的数字：->");
            int userInput = scanner.nextInt();
            if (randomNumber == userInput) {
                System.out.println("you are right!");
                count = 0;
            } else if (randomNumber > userInput) {
                System.out.println("sorry, guess small!");
            } else if (randomNumber < userInput) {
                System.out.println("sorry, guess big!");
            }
        }
        System.out.println("游戏结束！");
    }
}
