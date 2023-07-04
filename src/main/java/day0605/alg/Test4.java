package day0605.alg;

/**
 * 例：
 * 定义数组：int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 * 如何实现数组元素的反转存储？
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //反转操作

        // Refactor -> Extract ...

        // 方式1
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        System.out.println(newArr);

        // 方式2
        // /2
        for (int i = 0; i < arr.length; i++) {
            // 交换arr[i] 与 arr[arr.length - 1 - i]位置的元素
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(arr);

        // 方式3
        // double index
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 交换arr[i] 与 arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(arr);

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
