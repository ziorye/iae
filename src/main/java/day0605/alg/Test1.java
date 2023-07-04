package day0605.alg;

/**
 * 例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后输出其中的最大值，最小值，总和，平均值。
 * <p>
 * 要求：所有随机数都是两位数：[10,99]
 * <p>
 * 提示：求[a,b]范围内的随机数： (int)(Math.random() * (b - a + 1)) + a;
 */
public class Test1 {
    public static void main(String[] args) {
        // 1. 动态初始化方式创建数组
        /*
        int[] arr = new int[10];
         */

        // 2. 通过循环给数组元素赋值
        /*
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i] + "\t");
        }
         */


        System.out.println();

        // 3.1 求最大值
        /*
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
         */
        System.out.println("最大值为：" + 0);

        // 3.2 求最小值
        /*
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
         */
        System.out.println("最小值为：" + 0);

        // 3.3 求总和
        /*
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
         */
        System.out.println("总和为：" + 0);

        // 3.4 求平均值
        /*
        int avgValue = sum / arr.length;
         */
        System.out.println("平均值为：" + 0);
    }
}
