package day03;

/**
 * 数据类型
 *     本质上就是不同的容器、内存区域
 *
 * by type
 *   Primitive Data Types：
 * 		整型：
 * 	      byte
 * 	      short
 * 	      int
 * 	      long
 * 		浮点型：
 * 	      float
 * 	      double
 * 		字符型：char
 * 		布尔型：boolean
 *
 *
 * 	  引用数据类型：
 * 		类(class)
 * 		接口(interface)
 * 		数组(array)
 *      ...
 *
 *
 * by location
 *      成员变量 Fields
 *        实例变量 Instance Variables (Non-Static Fields)
 *        类变量 Class Variables (Static Fields)
 *      局部变量 Local Variables
 *        方法内
 *        代码块内
 *        方法参数 Parameters
 *
 * Next
 * @see DataTypes2
 */
public class DataTypes {
    public static void main(String[] args) {
        /*
        整型：
            byte: 8-bit, 1字节, -128 to 127
            short: 16-bit, 2字节, -32,768 to 32,767, -2^15 ~ 2^15-1
            int: 32-bit, 4字节, -2^31 ~ 2^31-1，约21亿
            long: 64-bit, 8字节，-2^63 ~ 2^63-1
         */
        byte from = 12;
        byte to = -128;
        System.out.println(from);
        System.out.println(to);
        //to = 128;

        short size = 128;
        // 常用 int
        int commonUse = 1234;
        // long L/l
        long big = 3414234324L;
        System.out.println(big);

        // === === ===

        // https://zh.wikipedia.org/zh-cn/IEEE_754
        /*
        浮点型：
            float: 单精度，32-bit, 4字节, -3.403E38 ~ 3.403E38
            double: 双精度，64bit, 8字节, -1.798E308 ~ 1.798E308

            @see java.math.BigDecimal
         */
        //浮点型，浮动的小数点，表示带小数点的数值

        double double1 = 128.8;
        System.out.println(double1);
        // F/f
        // float float1 = 18.8;
        float float1 = 18.8F;
        System.out.println(float1);
        // 常用 double

        // === === ===

        /*
        字符型：
            char: 16-bit, 2字节, It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
         */
        // '' & one char
        char c1 = 'a';
        //c1 = 'AB';
        System.out.println(c1);

        char c2 = '8';
        char c3 = '好';
        char c4 = 'Ǫ';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // 转义字符
        char c5 = '\n';//换行符
        //c5 = '\t';//制表符
        System.out.print("Hello" + c5);
        System.out.println("World");

        // Unicode
        // https://zh.wikipedia.org/wiki/Unicode%E5%AD%97%E7%AC%A6%E5%88%97%E8%A1%A8
        char c6 = '\u0043';
        System.out.println(c6);
        // https://zh.wikipedia.org/wiki/ASCII

        // === === ===

        /*
        布尔型：
            boolean: true/false
         */
        // 常用于条件判断
        boolean boolean1 = true;
        System.out.println(boolean1);

        boolean result = true;
        if(result){
            System.out.println("恭喜你，自由了");
        }else{
            System.out.println("池中鱼、笼中鸟");
        }
        // Code -> Reformat Code
    }
}
