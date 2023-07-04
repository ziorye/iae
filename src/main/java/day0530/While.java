package day0530;

/**
 * while loop
 *
 * ① 初始化条件
 * ② 循环条件  ---> boolean
 * ③ 循环体
 * ④ 迭代条件
 *
 * ①
 * while(②){
 * 	③;
 * 	④;
 * }
 *
 * 执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②
 *
 *
 */
public class While {
    public static void main(String[] args) {
        // 遍历1-100以内的所有偶数
        int i = 1;
        while(i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;//
        }

        /*
        i value vs for
         */
        System.out.println(i);
    }
}
