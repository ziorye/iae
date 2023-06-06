package day0606.util;

import java.util.Arrays;

/**
 * 数组工具类
 *
 * @see java.util.Arrays
 */
public class ArraysTest {
    public static void main(String[] args) {
        //1. equals
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr1 == arr2);

        //2. toString
        System.out.println(arr1);

        //3. fill
        /*
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));
         */

        //4. sort
        int[] arr3 = new int[]{-2, 45, 0, 11, -9};
        /*
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
         */

        //5. binarySearch
        int index = Arrays.binarySearch(arr3, 11);
        if (index >= 0) {
            System.out.println("找到了，索引位置为：" + index);
        } else {
            System.out.println("未找到");
        }
    }
}
