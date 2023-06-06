package day0606.sort;

/**
 * 排序算法
 *   将一串数组（一个列表）中的元素（整数，数字，字符串等）按某种顺序（增大，减小，字典顺序等）重新排列。
 * <a href="https://visualgo.net/zh/sorting?slide=1">sorting</a>
 *
 * 冒泡排序
 *   排序算法之一，它比较两个相邻的元素并决定是否交换它们，直到它们按预期顺序排列。
 *   就像水中气泡上升到表面的运动过程一样
 *
 * 原理
 *   1. 第一次迭代（比较和交换）
 *     - 从第一个索引开始，比较第一个和第二个元素
 *     - 如果第一个元素大于第二个元素，则交换它们
 *     - 接着，比较第二个和第三个元素。如果它们不符合顺序，请交换它们
 *     - 上述过程一直持续到最后一个元素
 *   2. 剩余迭代
 *     - 其余迭代将继续执行相同的过程
 *     - 每次迭代后，未排序元素中最大的元素将移动到尾部合适的位置
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 45, 0, 11, -9};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //冒泡排序，实现数组元素从小到大排列
        /*
        comment outer for, step 1
         */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 如果 arr[j] > arr[j + 1]，交互
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
