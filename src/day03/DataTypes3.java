package day03;

/**
 * 强制类型转换
 *
 * Next
 * @see DataTypes4
 */
public class DataTypes3 {
    public static void main(String[] args) {
        double double1 = 19.9;
        /*
        损
         */
        int int1 = (int)double1;
        System.out.println(int1);

        /*
        无损
         */
        long long1 = 121;
        short short2 = (short)long1;
        System.out.println(short2);

        /*
        损
         */
        int int2 = 128;
        byte byte1 = (byte)int2;
        System.out.println(byte1);
    }
}
