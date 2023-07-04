package day0530;

/**
 * do while loop
 * <p>
 * ① 初始化条件
 * ② 循环条件  ---> boolean
 * ③ 循环体
 * ④ 迭代条件
 * <p>
 * ①
 * do{
 * ③;
 * ④;
 * }while(②);
 * <p>
 * 执行过程：① - ③ - ④ - ② - ③ - ④ - ... - ②
 * <p>
 * >=1
 * <p>
 * for、while、do-while
 */
public class DoWhile {
    public static void main(String[] args) {
        dw1();
        dw2();
    }

    private static void dw1() {
        // 遍历1-100以内的偶数,并计算所有偶数的和及偶数的个数
        int num = 1;
        int sum = 0;//记录总和
        int count = 0;//记录个数

        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        } while (num <= 100);

        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);
    }

    private static void dw2() {
        /*
        15
         */
        int number1 = 10;
        while (number1 > 10) {
            System.out.println("hello in while loop");
            number1--;
        }

        int number2 = 10;
        do {
            System.out.println("hello in do-while loop");
            number2--;
        } while (number2 > 10);
    }
}
