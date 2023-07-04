package day0530;

public class For1 {
    public static void main(String[] args) {
        f1();
        f2();
    }

    private static void f1() {
        /*
        abcbcbc
         */
        int num = 1;
        for (System.out.print('a'); num <= 3; System.out.print('c'), num++) {
            System.out.print('b');
        }
    }

    private static void f2() {
        //输出1-100以内的偶数, 输出所有偶数的和, 输出偶数的个数
        /*
        int sum = 0;//记录所有偶数的和
        int count = 0;//记录偶数的个数
        for(int i = 1;i <= 100;i++){

            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
            //System.out.println("总和为：" + sum);
        }

        System.out.println("总和为：" + sum);
        System.out.println("个数为：" + count);
         */
    }
}
