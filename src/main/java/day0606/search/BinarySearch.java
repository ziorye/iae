package day0606.search;

/**
 * 二分查找
 *
 * 前提：有序
 *
 * 问题描述
 *   已知数组：int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
 *   查找4是否在上述数组中出现过？如果出现，输出对应的索引值。
 *
 * 预期输出
 *   在index=**的位置上找到了**
 *   没有找到**
 *
 * keynote
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr2 = new int[]{3, 4, 5, 6, 7, 8, 9};
        int target = 4;

        int low = 0;
        int high = arr2.length - 1;

        boolean found = false;
        while (low <= high) {
            int middle = (low + high) / 2;

            if (target == arr2[middle]) {
                System.out.println("在index=" + middle + "的位置上找到了" + target);
                found = true;
                break;
            } else if (target > arr2[middle]) {
                low = middle + 1;
            } else {//target < arr2[middle]
                high = middle - 1;
            }
        }

        if (!found) {
            System.out.println("没有找到" + target);
        }
    }
}
