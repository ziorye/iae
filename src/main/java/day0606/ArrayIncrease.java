package day0606;

/**
 * 数组的扩容
 * <p>
 * 数组 int[] arr = new int[]{1, 2, 3, 4, 5};
 * 请将数组长度扩容1倍，并将11,21,31三个数据添加到arr数组中
 */
public class ArrayIncrease {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // 扩容1倍容量
        int[] newArr = new int[arr.length * 2];
        /*
        arr.length << 1
         */

        // 将原有数组中的元素复制到新的数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 将11, 21, 31三个数据添加到新数组中
        newArr[arr.length] = 11;
        newArr[arr.length + 1] = 21;
        newArr[arr.length + 2] = 31;

        // 将新的数组的地址赋值给原有的数组变量
        arr = newArr;

        // 遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
