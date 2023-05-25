package day03;

/**
 * String 类型变量的使用
 *   - 引用数据类型，字符串
 *   - ""
 *   - 运算：String + Primitive Data Types
 *   - result: String
 *
 * Next
 * @see Bdoh
 */
public class StringBasic {
    public static void main(String[] args) {
        String msg = "Hello World!";
        System.out.println(msg);

        String single = "a";
        String emptyString = "";
        //char emptyChar = '';

        String prefix = "百搭：";
        // byte\short\int\long float\double char boolean
        // 动手敲

        // Practice 1
        /*
        97
         */
        char c = 'a';
        int num = 10;
        String str = "hello";

        /*
        107hello
         */
        System.out.println(c + num + str);
        /*
        ahello10
         */
        System.out.println(c + str + num);
        /*
        a10hello
         */
        System.out.println(c + (num + str));
        /*
        107hello
         */
        System.out.println((c + num) + str);
        /*
        hello10a
         */
        System.out.println(str + num + c);

        // Practice 2
        //*[制表符]*
        /*
        yes
         */
        System.out.println("*   *");
        /*
        no: 93
        char cc = '*';
        int cci = cc;
         */
        System.out.println('*' + '\t' + '*');
        /*
        yes
         */
        System.out.println('*' + "\t" + '*');
        /*
        no: 51*
         */
        System.out.println('*' + '\t' + "*");
        /*
        yes
         */
        System.out.println('*' + ('\t' + "*"));


        // Practice 3
        short s = 5;
        /*
        no
         */
        //s = s - 2;
        byte b = 3;
        /*
        no
         */
        //b = b + 4;
        char c1 = 'd';
        int i = 5;
        float f = 3.14F;
        /*
        yes
         */
        //double result = c + i + f;
        byte bt = 6;
        short sb = 2;
        /*
        no
         */
        //short btSb = bt + sb;
    }
}
