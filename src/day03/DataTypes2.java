package day03;

/**
 * 自动类型提升
 *   不同数据类型的变量之间做运算时，结果自动提升为容量大的数据类型
 *
 *     byte --> int --> long --> float --> double
 *     short --> int --> long --> float --> double
 *     char --> int --> long --> float --> double
 *
 *     byte、char、short -> int
 *
 * 	   byte 、char 、short --> int --> long --> float --> double
 *
 * Next
 * @see DataTypes3
 */
public class DataTypes2 {
    public static void main(String[] args) {
        byte byte1 = 8;
        int int1 = 188;
        //byte byte2 = byte1 + int1;
        int int2 = byte1 + int1;
        long long1 = byte1 + int1;
        System.out.println(int2);

        float float1 = byte1 + int1;
        System.out.println(float1);

        short short1 = 113;
        double double1 = short1 + 2;
        System.out.println(double1);

        // === byte、char、short ===
        /*
        https://zh.wikipedia.org/wiki/ASCII
        97
         */
        char chart1 = 'a';
        int int3 = 10;
        int int4 = chart1 + int3;
        System.out.println(int4);

        short short2 = 88;
        //char char2  = chart1 + short2;

        byte byte2 = 89;
        //char char3 = chart1 + byte2;

        //short short3 = byte2 + short2;

        //short short4 = byte1 + byte2;
        // === === ===
    }
}
