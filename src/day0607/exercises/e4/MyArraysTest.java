package day0607.exercises.e4;

public class MyArraysTest {
    public static void main(String[] args) {
        MyArrays ma = new MyArrays();
        int[] arr = new int[]{34, 56, 223, 2, 56, 24, 56, 67, 778, 45};

        //求最大值
        System.out.println("最大值为：" + ma.getMax(arr));
        //求平均值
        System.out.println("平均值为：" + ma.getAvg(arr));

        //遍历
        ma.print(arr);

        //查找
        int index = ma.linearSearch(arr, 24);
        if (index >= 0) {
            System.out.println("找到了，位置为：" + index);
        } else {
            System.out.println("未找到");
        }

        //排序
        ma.sort(arr);
        //遍历
        ma.print(arr);
    }
}
