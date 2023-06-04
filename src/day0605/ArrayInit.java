package day0605;

public class ArrayInit {
    public static void main(String[] args) {
        // 5. 数组元素的默认初始化值
        /*
        整型 byte short int long
        浮点 float double
        字符 char
        布尔 boolean
        引用 String ...
         */
        int[] ints = new int[3];
        //int[] ints = new int[]{1, 5, 9};
        System.out.println(ints[0]);

        // ...

        double[] doubles = new double[2];

        char[] chars = new char[2];
        /*
        charts[0]
        (int)chars[0]
        charts[0] == 0
        charts[0] == '0'
        charts[0] == '\u0000'
         */

        String[] strings = new String[2];

        // === === ===
        // 敲代码
        /*
        读题 + 动手

        --- --- --- --- --- ---
        题目描述
            创建一个名称为 numbers 的 double 类型数组，数组元素的值是 3.8, 8.6, 1.9, -3.4
            用循环的方式打印它们的值。

        预期结果
        3.8
        8.6
        1.9
        -3.4
        --- --- --- --- --- ---

        Next: sum
         */
    }
}
