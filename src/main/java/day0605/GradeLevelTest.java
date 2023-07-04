package day0605;

import java.util.Scanner;

/**
 * 例
 * 学生考试等级划分
 *
 * 问题描述
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 	 成绩>=最高分-10    等级为’A’
 * 	 成绩>=最高分-20    等级为’B’
 * 	 成绩>=最高分-30    等级为’C’
 * 	 其余              等级为’D’
 *
 * 预期结果
 *   从键盘输入学生总人数
 *   如何一个个输入学生成绩
 *   最后输出最高分和每个学生成绩等级
 *     - 最高分是：**
 *     - 第**个学生的分数是**，对应等级为[A|B|C|D]
 *
 */
public class GradeLevelTest {
    public static void main(String[] args) {
        /*
        // 1. 从键盘输入学生的人数，根据人数，创建数组(动态初始化)
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = scan.nextInt();

        int[] scores = new int[count];

        // 2. 根据提示，依次输入学生成绩，并将成绩保存在数组元素中
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }


        //3. 获取学生成绩的最大值
        int maxScore = 0;
        //scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        System.out.println("最高分是：" + maxScore);

        //4. 遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                System.out.println("第" + i + "个学生的分数是" + scores[i] + "，对应等级为A");
            } else if (scores[i] >= maxScore - 20) {
                System.out.println("第" + i + "个学生的分数是" + scores[i] + "，对应等级为B");
            } else if (scores[i] >= maxScore - 30) {
                System.out.println("第" + i + "个学生的分数是" + scores[i] + "，对应等级为C");
            } else {
                System.out.println("第" + i + "个学生的分数是" + scores[i] + "，对应等级为D");
            }
        }

        scan.close();
         */
    }
}
