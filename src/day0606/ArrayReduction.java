package day0606;

/**
 * 数组的缩容
 * <p>
 * 数组 int[] arr={1, 2, 3, 4, 5, 6, 7}
 * 如何删除数组中index=4的元素。
 */
public class ArrayReduction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int deleteIndex = 4;

        //方式1：不新建数组
        arr = withoutNewArray(arr, deleteIndex);

        //方式2：新建数组，新的数组的长度比原有数组的长度少1个
        //arr = withNewArray(arr, deleteIndex);

        //遍历arr数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    private static int[] withNewArray(int[] arr, int deleteIndex) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            newArr[i] = arr[i];
        }

        for (int i = deleteIndex; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        arr = newArr;

        return arr;
    }

    private static int[] withoutNewArray(int[] arr, int deleteIndex) {
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //修改最后元素,设置为默认值
        arr[arr.length - 1] = 0;

        return arr;
    }
}
