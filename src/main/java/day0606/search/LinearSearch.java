package day0606.search;

/**
 * 线性查找
 *
 * 问题描述
 *   已知数组 int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
 *   查找20是否在上述数组中出现过？如果出现，输出对应的索引值；否则输出没有找到
 *
 * 预期输出
 *   在index=**的位置上找到了**
 *   没有找到**
 *
 * keynote
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};

        int target = 20;

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("没有找到" + target);
        }

        /*
        without found
        i == arr.length
        new method return index/-1
         */
    }
}
